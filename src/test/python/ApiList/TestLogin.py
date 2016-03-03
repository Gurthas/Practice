#coding: utf-8
import unittest
import requests
from ApiList import SharkClient
import time
import hashlib


class TestLogin(unittest.TestCase): 
    def setUp(self):
        print ''
        self.client = SharkClient('debug')
    def test_login(self):
        post_verify_code = self.client.login_sms('15011431186')#请求获取验证码
        verify_code = self.client.query_verify_code('15011431186')#取到验证码
        print verify_code
        user_token1 = hashlib.md5()
        user_token1.update(str(time.time()))
        user_token = user_token1.hexdigest()
        url = 'http://dev.shark.kuaikuaiyu.com/api.login?platform=android&version=0,21'
        data = {
            'mobile': '15011431186',
            'code': verify_code,
            'user_token': user_token,
            'rdid': '_DEVICE_ID',
            'bb': '_BB',
        }
        login = requests.post(url,data)
        print user_token
        print login.text
        
    
        


if __name__ == "__main__":
    #import sys;sys.argv = ['', 'Test.testName']
    unittest.main()