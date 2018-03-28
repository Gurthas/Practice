#coding=utf-8
from common import connect
import os
import datetime
# connect device 1
desired_caps = {}
desired_caps = connect.init_connet('Android', '4.4.2', '26a913b', 'com.mia.miababy','.module.welcome.AppStartActivity')
driver = connect.connects(desired_caps)


'''
# connect device 2
desired_caps = {}
desired_caps = connect.init_connet('Android', '5.1', 'TA09004RWY', 'com.mia.miababy','.module.welcome.AppStartActivity')
driver = connect.connects(desired_caps)
'''