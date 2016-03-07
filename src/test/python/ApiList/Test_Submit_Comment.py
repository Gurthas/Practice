#coding: utf-8
import unittest
import requests
from qqqq.ApiList import SharkClient
import time
import hashlib


class Test_Submit_Comment(unittest.TestCase):
    def setUp(self):
        self.client = SharkClient('debug')
        res0 = self.client.login('15011431186')
        print 'start...'
        
    def test_submit_comment(self):
        res = self.client.submit_comment('我凑屌啊','good','569efb3cc7949e00015336a4')
        print res

    def tearDown(self):
        print '*****************************************'
        print 'destroyed...'   
        