#coding: utf-8
'''
Created on 2016年3月3日

@author: sss
'''
import unittest
import requests
import json


class TestAreas(unittest.TestCase):


    def setUp(self):
        print 'start'
        
    def test_get_areas(self):
        url = 'http://dev.shark.kuaikuaiyu.com/api.area?platform=android&version=0,21&did=5978ad54b1c2033d'
        params={
            'longitude':116.502004,
            'latitude':39.92069,
            'name':'',
            'city':'',
            'ids':'',
            'divison_name':'',                   
        }
        response = requests.get(url, params)
        response1 = json.loads(response.text)
        print response1
       #response2 = str(response1).replace('u\'', '\'')
        #print response1['data']['areas'][0]['name']
if __name__ == "__main__":
    #import sys;sys.argv = ['', 'Test.testName']
    unittest.main()