#coding=utf-8
from appium import webdriver
from appium.webdriver import WebElement
from selenium.webdriver.support.ui import WebDriverWait
import unittest
import threading
from time import ctime,sleep
from GlobalParams import driver
from common import actions
class order_checkout(unittest.TestCase):
    def setUp(self):
        pass
    def tearDown(self):
        pass
    def order_checkout(self):
        sleep(6)
        checkhead_text="com.mia.miababy:id/header_title_text"
        actions.check(self,driver,checkhead_text,"结算")
        checkout_button="com.mia.miababy:id/cart_pay_textView"#结算按钮
        actions.dr(driver,checkout_button,0) #结算按钮点击
