import unittest
from ApiList import SharkClient
from api_test.ApiList import _DEVICE_ID, _BB
import requests
import json
import time
import hashlib
class TestLogin(unittest.TestCase):
    def setUp(self):
        self.client = SharkClient('debug')
    def test_login(self):
        url = 'http://dev.shark.kuaikuaiyu.com/api.login?platform=android&version=0,21'
        user_token1 = hashlib.md5()
        user_token1.update(str(time.time()))
        user_token = user_token1.hexdigest()
        res = self.client.login_sms('15011431186')
        verify_code = self.client.query_verify_code('15011431186')
        print verify_code
        print user_token
        data = {
            'mobile':'15011431186',
            'code':verify_code,
            'user_token':user_token,
            'rdid':_DEVICE_ID,
            'bb':_BB,}
        login = requests.post(url,data)
        print login.text
        