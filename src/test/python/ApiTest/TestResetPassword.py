# coding: utf-8
import unittest
import requests
from ApiList import SharkClient
import hashlib

class TestResetPassword(unittest.TestCase):
    def setUp(self):
        self.client = SharkClient('debug')
        
    def test_reset_password(self):
        post_verify_code = self.client.login_sms('15011431186')#请求获取验证码
        verrify_code = self.client.query_verify_code('15011431186')#取到验证码
        print verrify_code
        url = 'http://dev.shark.kuaikuaiyu.com/api.reset.password?platform=android&version=0,21&did=5978ad54b1c2033d'
        m = hashlib.md5()#获取密码的md5加密
        m.update('654321')
        password = m.hexdigest()
        data = {
        'mobile':'15011431186',
        'password':password,
        'code':verrify_code,      
        }
        resp = requests.post(url,data)
        print password
        print resp.text
    
        
        