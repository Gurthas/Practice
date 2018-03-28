#coding=utf-8
from appium import webdriver
from appium.webdriver import WebElement
from selenium.webdriver.support.ui import WebDriverWait
import unittest
import threading
from time import ctime,sleep

from GlobalParams import driver
from common import actions
from common import hdpm

def avd(self):
        #wait
        sleep(5)
        elements_update  = driver.find_elements_by_id("update_title")
        elements_adv = driver.find_elements_by_id("adv_dialog")
        if len(elements_update):
            driver.find_element_by_id("com.mia.miababy:id/iv_closed_dialog").click()
        elif len(elements_adv):
            driver.find_element_by_id("com.mia.miababy:id/iv_closed_dialog").click()
        else:
            print("No update and adv info")