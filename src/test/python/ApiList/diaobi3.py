# encoding: utf-8
import unittest
import requests
from qqqq.ApiList import SharkClient



class TestShopList(unittest.TestCase):

    def setUp(self):
        print "start..."
        self.client = SharkClient('debug')
    def test_get_shop_list(self):
        res = self.client.get_shop_list('5680df9038a21241203474f6')
        print res
        self.assertIsNotNone(res.get('shops'))
