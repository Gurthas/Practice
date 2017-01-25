# coding: utf-8
import unittest
from ApiList import SharkClient

class TestResetPassword(unittest.TestCase):
    def setUp(self):
        self.client = SharkClient('debug')
        
    def test_reset_password(self):
        res = self.client.test_reset_password('15011431186', '123456')
        print res
        