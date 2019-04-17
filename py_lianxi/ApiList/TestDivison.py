# coding: utf-8
import unittest
import requests
import json
class TestDivison(unittest.TestCase):
    def setUp(self):
        print 'start...'
        
    def test_divison(self):    
        url = 'http://dev.shark.kuaikuaiyu.com/api.admin.division?platform=android&version=0,21&did=5978ad54b1c2033d'
        params={
            'division_name':'北京市',
            'level':2,
            }
        division = requests.get(url, params)
        print division.text
        res = json.loads(division.text)
        print res['data']['divisions'][1]
        
    def tearDown(self):
        print 'destroyed...'   