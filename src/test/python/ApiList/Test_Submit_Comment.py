#coding: utf-8
import unittest
import requests
from qqqq.ApiList import SharkClient
from qqqq.GetVerifyCode import GetVerifyCode


class Test_Submit_Comment(unittest.TestCase):
    def setUp(self):
        self.client = SharkClient('debug')
        print 'start...'
    def test_submit_comment(self):
        res = self.client.submit_comment('5583b16f38a2124d5c799368',GetVerifyCode.use_server_token, '我凑屌啊', 'good', GetVerifyCode.user_token,'56a1d83c1ad1d400018af8d8')
        print res
        '''
        url = 'http://dev.shark.kuaikuaiyu.com/api.order.comment.submit?platform=android&version=0,21' 
        data = {
            'uid':'5583b16f38a2124d5c799368',
            'server_token':GetVerifyCode.use_server_token,
            'comment':'卧槽屌哦',
            'comment_type':'good',
            'user_token':GetVerifyCode.user_token,
            'oid':'56a1d9711ad1d400018af8ed',
            }
        response = requests.post(url,data)
        print GetVerifyCode.use_server_token
        print response.text
        '''
        
    def tearDown(self):
        print '*****************************************'
        print 'destroyed...'   
        