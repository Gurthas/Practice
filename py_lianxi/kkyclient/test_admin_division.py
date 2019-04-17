# encoding: utf-8
import unittest
from shark_client import SharkClient


class TestAdminDivision(unittest.TestCase):

    def setUp(self):
        self.client = SharkClient('debug')

    def test_admin_province(self):
        self.res_province = self.client.get_admin_division('', 0)
        self.assertEqual(u'北京市', self.res_province['divisions'][0])
        self.assertEqual(u'甘肃省', self.res_province['divisions'][26])

    def test_admin_area(self):
        self.res_area = self.client.get_admin_division(u'四川省', 1)
        self.assertEqual(u'成都市', self.res_area['divisions'][0])



