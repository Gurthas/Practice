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
class seach(unittest.TestCase):
    def setUp(self):
        pass
    def tearDown(self):
        pass
    def seachcheck(self):
        sleep(5)
        elements_update  = driver.find_elements_by_id("update_title")
        elements_adv = driver.find_elements_by_id("adv_dialog")
        if len(elements_update):
            driver.find_element_by_id("com.mia.miababy:id/iv_closed_dialog").click()
        elif len(elements_adv):
            driver.find_element_by_id("com.mia.miababy:id/iv_closed_dialog").click()
        else:
            print("No update and adv info")
        sleep(5)
        num=5
        for i in range(1,num):
            driver.keyevent(4)
            sleep(2)
        syicon="com.mia.miababy:id/tab_item_icon"
        actions.dr(driver,syicon,0,)
        actions.swiepToLeft(driver,800,5)
        actions.take_screenshot(driver)#截图
        search_keyword="com.mia.miababy:id/search_keyword"
        actions.dr(driver,search_keyword,0,)
        #search_keyword=driver.find_elements_by_id("com.mia.miababy:id/search_keyword")
        #search_keyword[0].click()
        input_text="com.mia.miababy:id/search_head_input_text"
        actions.sys(driver,input_text,0,"纸尿裤")
        actions.take_screenshot(driver)#截图
        #search_keyword=driver.find_elements_by_id("com.mia.miababy:id/search_head_input_text")
        #search_keyword[0].send_keys("纸尿裤")
        search="com.mia.miababy:id/search_promp_item_tv"
        actions.dr(driver,search,0)
        sleep(6)
        #hdpm.swipeUp(self,800)
        actions.swipeToUp(driver,100,10)
        actions.take_screenshot(driver)#截图
        driver.keyevent(4)
        #back_btn=driver.find_elements_by_id("com.mia.miababy:id/header_back_btn")
       # back_btn[0].click()