# encoding: utf-8
import unittest
import requests
import json


class TestShopList(unittest.TestCase):
    def setUp(self):   
        print "start..."
                   
    def testGetShopList(self):
        data ={
        'area_id':'5680df9038a21241203474f6'
        }
        url1  = 'http://dev.shark.kuaikuaiyu.com/api.shop.list?platform=android&version=0,21'
        res = requests.post(url1, data)
        print res.text
        message = json.loads(res.text)
        print message
        self.assertEqual(message.get('flag'),'ok')
