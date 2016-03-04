# encoding: utf-8
import unittest
from shark_client import SharkClient


class TestOrderPreSubmit(unittest.TestCase):

    goods = [{
                'num': 1,
                'goodid': '56d4363bd19af7405f958690'
            }]
    sid = '55cc0bc6463abe00014bff65:551cf0dd778d1778155c7572'

    def setUp(self):
        self.client = SharkClient('debug')
        self.client.login('13720079875')

    def test_order_pre_submit(self):
        self.res_pre_order = self.client.get_order_presubmit(self.goods, self.sid)
        self.assertIsNotNone(self.res_pre_order['pay_method'])

    def test_order_submit(self):
        address = u'远洋天地55号楼3单元102'
        bid = '569b76d738a212412015fc5b'
        latitude = 39.91354
        longitude = 116.4919
        mobile = '13720079875'
        name = '天才zdx'
        type = 'alipay'
        self.res_order = self.client.get_order_submit(address, bid, self.goods, latitude, longitude, mobile, name,
                                                      self.sid, type)
        self.assertIsNotNone(self.res_order['pay_total'])

