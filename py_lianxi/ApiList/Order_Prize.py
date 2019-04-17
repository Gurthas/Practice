import unittest
from ApiList import SharkClient

class Order_Prize(unittest.TestCase):
    def setUp(self):
        self.client = SharkClient('debug')
        self.client.login('15011431186')
        
    def test_order_prize(self):
        res = self.client.order_prize('56824b7605d6b80001b89e85', 'alipay')  
        print res 