
#coding : utf-8
import unittest
from ApiList import SharkClient

class Test_Preoder_Schedule(unittest.TestCase):
    def setUp(self):
        self.client  = SharkClient('debug')
        self.client.login('15011431186')
    
    def test_preorder_schedule(self):
        res = self.client.preorder_schedule('56824b7605d6b80001b89e85:566e800738a2127e2686f9f8')
        print res
    #预约订单