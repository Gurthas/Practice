#!/usr/bin/env python
# coding: utf-8
__author__ = 'wzy'
__date__ = '2015-12-18 10:50'

import json
import logging

import requests

_DEVICE_ID = 'wang-test-device'
_BB = 'xx00xx00xxoo'


class SharkClient(object):

    _HOSTS = {
        'localhost': 'http://localhost:9101',
        'debug': 'http://dev.shark.kuaikuaiyu.com'
    }
    _COMMON_QUERY_PARAM = {
        'platform': 'android',
        'version': '0,20',
        'did': _DEVICE_ID
    }

    _USER_ID = None
    _SERVER_TOKEN = None
    _USER_TOKEN = ''

    def __init__(self, host_config):
        self.host = self._HOSTS[host_config]

    def login(self, mobile):
        self.login_sms(mobile)
        code = self.query_verify_code(mobile)

        data = {
            'mobile': mobile,
            'code': code,
            'user_token': '',
            'rdid': _DEVICE_ID,
            'bb': _BB,
        }
        res = self._post('/api.login', data=data)
        self._USER_ID = res['_id'],
        self._SERVER_TOKEN = res['server_token']
        self._COMMON_QUERY_PARAM['bbid'] = res['bbid']
        logging.info('%s login success', mobile)
        return True

    def login_sms(self, mobile):
        data = {
            'mobile': mobile,
            'sms_token': '',
        }
        self._post('/api.login.sms', data=data)

    def device(self, model, os, os_version, screen_size, app_version):
        data = {
            'model': model,
            'os': os,
            'osv': os_version,
            'ss': screen_size,
            'av': app_version,
        }
        self._post('/api.device', data)

    def feedback(self, content, mobile, location=None, area_id=None):
        data = {
            'feedback': content,
            'contact': mobile,
        }
        if location:
            data['longitude'] = location[0]
            data['latitude'] = location[1]
        if area_id:
            data['area_id'] = area_id
        self._post('/api.feedback', data)

    def get_address_list(self):
        self._get('/api.address')

    def add_address(self, name, mobile, address, area_id, building_id=None):
        data = {
            'name': name,
            'mobile': mobile,
            'address': address,
            'area_id': area_id,
        }
        if building_id is not None:
            data['building_id'] = building_id
        self._post('/api.address', data=data)

    def order_prize(self, order_id, pay_method):
        data = {
            'oid': order_id,
            'pay_method': pay_method
        }
        return self._post('/api.order.prize', data)

    def get_shop_list(self, area_id):
        data = {
            'area_id': area_id
        }
        return self._post('/api.shop.list', data)

    def get_shop_info(self, sid):
        data = {
            'sid': sid
        }
        return self._post('/api.shop.info', data)

    def get_goods_type(self, sid):
        data = {
            'sid': sid
        }
        return self._post('/api.goods.types', data)

    def get_goods_list(self, sid, tid, skip):
        data = {
            'skip': skip,
            'sid': sid,
            'tid': tid,
        }
        return self._post('/api.goods.list', data)

    def get_red_packet_list(self, limit, skip):
        data = {
            'limit': limit,
            'skip': skip
        }
        return self._post('/api.red.packet', data)

    def query_verify_code(self, mobile):
        url = '%s%s' % (self.host, '/debug.code.query')
        params = {
            'mobile': mobile,
        }
        r = requests.get(url, params)
        if r.status_code == 200:
            logging.info(r.text)
            return r.text[-4:]
        else:
            logging.error(r.text)
            raise Exception('query verify code error')

    def get_area_list(self, city):
        data = {
            'city': city
        }
        return self._get('/api.area', data)

    def get_order_presubmit(self, goods, sid):
        data = {
            'goods': json.dumps(goods),
            'sid': sid,
        }
        return self._post('/api.order.presubmit', data)

    def get_order_submit(self, address, bid, goods, latitude, longitude, mobile, name, sid, type):
        data = {
            'address': address,
            'bid': bid,
            'goods': json.dumps(goods),
            'latitude': latitude,
            'longitude': longitude,
            'mobile': mobile,
            'name': name,
            'sid': sid,
            'type': type
        }
        return self._post('/api.order.submit', data)

    def get_order_list(self, limit=0, skip=0):
        data = {
            'limit': limit,
            'skip': skip
        }
        return self._post('/api.order.list', data)

    def get_order_info(self, order_id):
        data = {
            'oid': order_id
        }
        return self._post('/api.order.info', data)

    def get_admin_division(self, division_name, level):
        data = {
            'division_name': division_name,
            'level': level
        }
        return self._get('/api.admin.division', data)

    def _get(self, api_url, data=None):
        return self._request('get', api_url, params=data)

    def _post(self, api_url, data):
        return self._request('post', api_url, data=data)

    def _put(self, api_url, data):
        return self._request('put', api_url, data=data)

    def _delete(self, api_url, data):
        return self._request('delete', api_url, params=data)

    def _add_common_data(self, data):
        if self._USER_ID is not None:
            data['uid'] = self._USER_ID
        if self._SERVER_TOKEN is not None:
            data['server_token'] = self._SERVER_TOKEN
        data['user_token'] = self._USER_TOKEN

    def _request(self, method, api_url, params=None, **kwargs):
        if params is None:
            params = self._COMMON_QUERY_PARAM
        else:
            params.update(self._COMMON_QUERY_PARAM)
        self._add_common_data(params)

        url = '%s%s' % (self.host, api_url)
        r = requests.request(method, url, params=params, **kwargs)
        logging.info(r.text.encode())
        data = json.loads(r.text)
        if data['flag'] != 'ok':
            logging.error('code %s, reason %s', data['code'], data['reason'])
            raise Exception('error')
        return data['data']

