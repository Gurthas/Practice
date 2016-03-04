# coding: utf-8
# __author__ = 'zdx'
# __date__ = '2016-03-04 10:26'

import logging
import unittest
from shark_client import SharkClient


class TestOrderList(unittest.TestCase):

    def setUp(self):
        self.client = SharkClient('debug')
        self.client.login('13720079876')

    def test_order_list(self):
        self.res = self.client.get_order_list()
        self.assertIsNotNone(self.res['orders'])
        logging.error(u'获取订单列表测试完成')
        print self.res

