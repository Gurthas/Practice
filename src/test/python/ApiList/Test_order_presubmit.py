#coding: utf-8
import unittest
from ApiList import SharkClient

class Test_order_presubmit(unittest.TestCase):
    
    goods = [
        {
            'goodid':'569de05ad19af7405f958450',
            'num':1,      
        }   ]
    
    def setUp(self):
        self.client = SharkClient('debug')
        self.client.login('15011431186')
        
    def test_order_presubmit(self):
       
        res = self.client.presubmit('56824b7605d6b80001b89e85:566e800738a2127e2686f9f8',self.goods) 
        print res