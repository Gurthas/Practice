# coding: utf-8
# __author__ = 'zdx'
# __date__ = '2016-03-04 15:03'

import unittest
from shark_client import SharkClient
import logging


class TestOrderInfo(unittest.TestCase):

    def setUp(self):
        self.client = SharkClient('debug')
        self.client.login('13720079877')

    def test_get_order_info(self):
        order_id = '56d93955b8eb7f0001df209e'
        self.res = self.client.get_order_info(order_id)
        self.assertEqual(100, self.res['total'])
        logging.error(u'获取订单信息测试完成')
