from ApiList import SharkClient
import unittest
import requests

class TestRegist(unittest.TestCase):
    def setUp(self):
        self.client = SharkClient('debug') 
    def test_signup(self):
        res = self.client.login('15011431186')
        print res