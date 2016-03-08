#coding: utf-8
import unittest
from ApiList import SharkClient

class Test_OrderList(unittest.TestCase):
    def setUp(self):
        self.client = SharkClient('debug')
        self.client.login('15011431186')
        
    def test_order_list(self):
        res = self.client.get_order_list()
        print res    