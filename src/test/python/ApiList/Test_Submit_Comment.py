#coding: utf-8
import unittest
import requests
import time
import hashlib
from TestLogin import TestLogin 

class Test_Submit_Comment(unittest.TestCase):
    def setUp(self):
        self.client = TestLogin
        print 'start...'
    def test_submit_comment(self): 
        url = 'http://dev.shark.kuaikuaiyu.com/api.order.comment.submit?platform=android&version=0,21' 
        data = {
            'uid':'5583b16f38a2124d5c799368',
            'server_token':'lRN1mc7DdUf7bKyOn0WjrAWF7s4k2ZqF',
            'comment':'卧槽 好屌哦',
            'comment_type':'good',
            'user_token':'0b77b7441474aff27f0a8849750f9bd8',
            'oid':'56a1dda41ad1d400018af8f9',
            }
        response = requests.post(url,data)
        print response.text
    def tearDown(self):
        print '*****************************************'
        print 'destroyed...'   
        