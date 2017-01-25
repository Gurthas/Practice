#!/usr/bin/env python
# coding: utf-8
__author__ = 'wzy'
__date__ = '2015-12-29 19:02'

import logging

from wukong_client import WukongClient
from shark_client import SharkClient

LOG_FORMAT = "[%(levelname)s, %(asctime)s, %(pathname)s:%(lineno)d] %(message)s"
logging.getLogger("requests").setLevel(logging.WARNING)
logging.basicConfig(level=logging.INFO, format=LOG_FORMAT)


if __name__ == '__main__':
    # client = WukongClient()
    # client._USER_ID = '561b86223a6e840001e31d3a'
    # client._SERVER_TOKEN = 'BfpAl0WOzI9IfASds4FmvJzPsFowHE3S'
    # # client.login('18610650693', '123456')
    # client.login_check()

    client = SharkClient('localhost')
    client.login('18610650693')
    client.get_address_list()
    client.add_address('王窝窝', '18610650693', u'哈哈哈哈哈哈', '5680df9038a21241203474f6')
    client.get_address_list()
    # client.device('Apple iPhone16', 'ios', '19.3.1', '1234', '1.9.1')
    # client.device('Apple iPhone16', 'ios', '19.3.1', '1234', '1.9.2')
    # client.feedback('hello this a test', 'ndkldhgkd', [116.496456, 39.907749], '5680df9038a21241203474f6')
