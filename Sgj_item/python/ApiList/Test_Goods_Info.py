#coding: utf-8
import unittest
from ApiList import SharkClient
import json

class Test_Goods_Info(unittest.TestCase):
    def setUp(self):
        self.client = SharkClient('debug')
        self.client.login('15011431186')
        
    def test_order_info(self):     
        res = self.client.goods_info('56824b7605d6b80001b89e85',json.dumps(['56a83568d19af7405f95858b','569de05ad19af7405f95845a','569de006d19af7405f95841d']))
        print res