# encoding: utf-8
import unittest
from shark_client import SharkClient


class TestRedPacket(unittest.TestCase):

    def setUp(self):
        self.client = SharkClient('debug')
        self.client.login('13720079874')

    def test_get_red_packet(self):
        self.res = self.client.get_red_packet_list(10000, 0)
        self.assertIsNotNone(self.res.get('redpackets'))




