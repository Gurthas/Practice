#!/usr/bin/env python
# coding: utf-8
__author__ = 'wzy'
__date__ = '2015-12-29 18:55'

import hashlib
import logging
import json
import urllib
import requests

class WukongClient(object):

    _HOST = 'http://dev.wukong.kuaikuaiyu.com'
    # _HOST = 'http://localhost:8999'

    _COMMON_QUERY_PARAM = {
        'platform': 'android',
    }

    _DEVICE_ID = 'wang-test-device'
    _BB = 'xx00xx00xxoo'

    _USER_ID = None
    _SERVER_TOKEN = None
    _USER_TOKEN = ''

    def login(self, mobile, password):
        data = {
            'mobile': mobile,
            'password': hashlib.md5(password).hexdigest(),
            'user_token': self._USER_TOKEN,
        }
        res = self._post('/api.login', data=data)
        self._USER_ID = res['_id'],
        self._SERVER_TOKEN = res['server_token']
        logging.info('%s login success', mobile)
        return True

    def login_check(self):
        data = {}
        res = self._post('/api.login.check', data)
        logging.info(res['status'])

    def _post(self, api_url, data):
        if self._USER_ID is not None:
            data['cid'] = self._USER_ID
        if self._SERVER_TOKEN is not None:
            data['server_token'] = self._SERVER_TOKEN
        data['user_token'] = self._USER_TOKEN
        return self._request('post', api_url, data=data)

    def _request(self, method, api_url, **kwargs):
        url = '%s%s?%s' % (self._HOST, api_url, urllib.urlencode(self._COMMON_QUERY_PARAM))
        r = requests.request(method, url, **kwargs)
        logging.info(r.text.encode())
        data = json.loads(r.text)
        if data['flag'] != 'ok':
            logging.error('code %s, reason %s', data['code'], data['reason'])
            raise Exception('error')
        return data['data']