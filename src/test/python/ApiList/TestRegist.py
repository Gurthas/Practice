from ApiList import SharkClient
import unittest
import requests

class TestRegist(unittest.TestCase):
    def setUp(self):
        self.client = SharkClient('debug') 
    def test_signup(self):
        res0 = self.client.login_sms('18511331131')
        res1 = self.client.query_verify_code('18511331131')
        print res1  
        res2 = self.client.signup_password('18511331131', '123456', res1, '', '') 
        print res2
        #self.assertIsNotNone("{}", 'error')