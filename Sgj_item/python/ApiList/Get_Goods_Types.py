#coding: utf-8

import unittest
from ApiList import SharkClient
class Get_Goods_List(unittest.TestCase):
    def setUp(self):
        self.client = SharkClient('debug')
    
    def test_goods_list(self):   
        res = self.client.get_goods_types('56824b7605d6b80001b89e85')
        print res
        
