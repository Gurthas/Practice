# encoding: utf-8
import unittest
from shark_client import SharkClient


class TestGoodsList(unittest.TestCase):

    def setUp(self):
        self.client = SharkClient('debug')

    def test_get_good_list(self):
        self.res = self.client.get_goods_list('5680e246b5e6dd0001164efa:5680df9038a21241203474f6', '5683581dd19af7405f95824b', 0)  # 饮料类
        self.assertIsInstance(self.res['goods'], list)
