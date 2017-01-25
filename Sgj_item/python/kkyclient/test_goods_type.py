# encoding: utf-8
import unittest
from shark_client import SharkClient

class TestGoodtypes(unittest.TestCase):

    def setUp(self):
        self.client = SharkClient('debug')

    def test_get_good_type(self):
        self.res = self.client.get_goods_type('5680e246b5e6dd0001164efa:5680df9038a21241203474f6')
        self.assertIsInstance(self.res['types'], list)
