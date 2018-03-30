#coding=utf-8
from common import connect
import os
import datetime
# connect device 1
desired_caps = {}
desired_caps = connect.init_connet('Android', '4.4.4', '192.168.216.101:5555', 'com.mia.miababy','.module.welcome.AppStartActivity')
driver = connect.connects(desired_caps)


'''
# connect device 2
desired_caps = {}
desired_caps = connect.init_connet('Android', '5.1', 'TA09004RWY', 'com.mia.miababy','.module.welcome.AppStartActivity')
driver = connect.connects(desired_caps)
'''