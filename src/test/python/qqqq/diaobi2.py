# encoding: utf-8
import unittest
from diaobi1 import SharkClient



class TestArea(unittest.TestCase):

    def setUp(self):
        self.client = SharkClient('debug')

    def test_get_area_list(self):
        res = self.client.get_area_list(u'北京市')
        print res
        self.assertIsNotNone(res.get('areas'))
