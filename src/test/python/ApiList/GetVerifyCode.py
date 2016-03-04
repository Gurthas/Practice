# coding: utf-8
import unittest
import requests
from ApiList import SharkClient
import hashlib
import time
import json

class GetVerifyCode():
    client = SharkClient('debug')
    post_verify_code = client.login_sms('15011431186')#请求获取验证码
    verify_code = client.query_verify_code('15011431186')#取到验证码
    user_token1 = hashlib.md5()
    user_token1.update(str(time.time()))
    user_token = user_token1.hexdigest()
    url = 'http://dev.shark.kuaikuaiyu.com/api.login?platform=android&version=0,21'
    data = {
            'mobile': '15011431186',
            'code': verify_code,
            'user_token':user_token,
            'rdid': '_DEVICE_ID',
            'bb': '_BB',
        }
    login = requests.post(url,data)
    login1 = json.loads(login.text)
    use_server_token = login1['data']['server_token']