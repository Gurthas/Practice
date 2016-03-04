# encoding: utf-8
import unittest
from shark_client import SharkClient


class TestArea(unittest.TestCase):

    def setUp(self):
        self.client = SharkClient('debug')

    def test_get_area_list(self):
        res = self.client.get_area_list(u'北京市')
        self.assertIsNotNone(res.get('areas'))
