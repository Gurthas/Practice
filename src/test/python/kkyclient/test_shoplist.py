# encoding: utf-8
import unittest
from shark_client import SharkClient


class TestShoplist(unittest.TestCase):
    def setUp(self):
        self.client = SharkClient('debug')

    # test with
    def test_get_shop_list(self):
        self.res = self.client.get_shop_list('5680df9038a21241203474f6')   # 校园加盟区域
        self.assertIsNotNone(self.res.get('shops'))
        self.assertEqual(u'校园加盟5555', self.res['shops'][1]['name'])

