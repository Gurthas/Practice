# encoding: utf-8
import unittest
from ApiList import SharkClient

class Test_Submit(unittest.TestCase):
    goods = [
        {
            'goodid':'569de05ad19af7405f958450',
            'num':1,      
        }   ]
            
    def setUp(self):
        self.client = SharkClient('debug')
        self.client.login('15011431186')
        
    def test_submit(self):
        res = self.client.submit(u'可以可以哦', '56a73b0838a2124120281928', self.goods, 116.4981588380420, 39.91425930620188, '13801111111', 'ddd', '56824b7605d6b80001b89e85:566e800738a2127e2686f9f8', 'alipay')
        print res
        #提交订单支付