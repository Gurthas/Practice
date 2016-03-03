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