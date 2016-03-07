# coding: utf-8
import unittest
import requests
import json
class TestSchoolList(unittest.TestCase):
    def setUp(self):
        print 'start...'
       
    def test_schoollist(self):
        url = 'http://dev.shark.kuaikuaiyu.com/api.school.list?platform=android&version=0,21'
        longitude = 116.502004
        latitude = 39.92069
        data = {
            'longitude':longitude,
            'latitude':latitude,  }
        schoollist = requests.post(url,data)
        s = json.loads(schoollist.text)
        print s ['data']['schools'][1]['name']
      
    def tearDown(self):
        print 'destroyed...'      