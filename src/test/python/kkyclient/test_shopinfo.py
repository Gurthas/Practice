# encoding: utf-8
import unittest
from shark_client import SharkClient


class TestShopInfo(unittest.TestCase):

    def setUp(self):
        self.client = SharkClient('debug')

    def test_get_shop_info(self):
        self.res = self.client.get_shop_info('5680e246b5e6dd0001164efa:5680df9038a21241203474f6')  # 校园加盟5555
        self.assertEqual(u'校园加盟5555', self.res['name'])