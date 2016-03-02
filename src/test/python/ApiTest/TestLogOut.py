#coding:utf-8
'''
Created on 2016年3月2日

@author: Administrator
'''
import unittest
import requests
from ApiList import SharkClient
from GetVerifyCode import GetVerifyCode
class TestLogOut(unittest.TestCase):
    def setUp(self):
        self.client = SharkClient('debug')
        print 'start...'
    
    def test_logout(self):
        url = 'http://dev.shark.kuaikuaiyu.com/api.logout?platform=android&version=0,21'
        data = {
            'uid':'5583b16f38a2124d5c799368',
            'server_token':'g8CfqYE2A99B84o6M1zlZWwHVXvbVPQZ',
            'user_token':'',
            }
        logout = requests.post(url,data)
        print logout.text
            
