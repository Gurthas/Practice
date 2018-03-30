#coding=utf-8
from appium import webdriver
from appium.webdriver import WebElement
from selenium.webdriver.support.ui import WebDriverWait
import datetime
import unittest
import os
import threading
from time import ctime,sleep
from GlobalParams import driver
from common import actions
from common import avd_check
from common import screen
from PIL import ImageGrab


class ItemCheckout(unittest.TestCase):
    def setUp(self):
        print("开始执行用例")
    def tearDown(self):
        print("用例执行结束")
    def intoShoppingCart(self):
        sleep(3)
        avd_check.avd(self) #检查广告弹层并关闭
        sleep(6)
        actions.take_screenshot(driver)#截图s
        sleep(3)
        element_cart = driver.find_element_by_android_uiautomator("new UiSelector().className(\"android.widget.LinearLayout\").childSelector(new UiSelector().className(\"android.widget.TextView\").text(\"购物车\"))")
        element_cart.click()
        actions.check(self,driver,"com.mia.miababy:id/header_title_text","购物车")
        #cart_title = driver.find_element_by_id("com.mia.miababy:id/header_title_text").text
        #self.assertEqual(cart_title, "购物车", 'Result Fail')
        print('case1: into shopping cart OK')
    def CartClear(self):
        # is cart empty ?
        sleep(6)
        is_cart_empty = driver.find_elements_by_id("com.mia.miababy:id/gohome_button")

        if len(is_cart_empty):
            actions.take_screenshot(driver)#截图
            print("The Shopping cart is empty")
            is_cart_empty[0].click()
            sleep(6)
        else:
            print("The Shopping cart is not empty")
            clearcart=driver.find_elements_by_id("com.mia.miababy:id/header_right")
            clearcart[0].click()
            delete_all_btn=driver.find_elements_by_id("com.mia.miababy:id/delete_all_btn")
            delete_all_btn[0].click()
            sleep(6)
            actions.take_screenshot(driver)#截图

        print('test_case2')
    def login(self):
        #login
        sleep(3)
        element_my = driver.find_element_by_android_uiautomator("new UiSelector().className(\"android.widget.LinearLayout\").childSelector(new UiSelector().className(\"android.widget.TextView\").text(\"我的\"))")
        element_my.click()
        level=driver.find_elements_by_id("com.mia.miababy:id/user_tv_level")

        if len(level)>0:
            print("已经登录")
            actions.take_screenshot(driver)#截图
        else:
            is_login=driver.find_elements_by_id("com.mia.miababy:id/login_button")
            if len(is_login):
                is_login[0].click()
                username=driver.find_elements_by_id("com.mia.miababy:id/et_context")
                username[0].send_keys("15011431186")
                password=driver.find_elements_by_id("com.mia.miababy:id/et_context")
                password[1].send_keys("111111")
                actions.take_screenshot(driver)#截图
                login_button=driver.find_elements_by_id("com.mia.miababy:id/btn_login")
                login_button[0].click()
                level=driver.find_elements_by_id("com.mia.miababy:id/user_tv_level")
                if len(level)>0:
                    print("验证登录成功")

    def addcart(self):
        sleep(6)
        actions.take_screenshot(driver)#截图

        wdsc=driver.find_elements_by_id("com.mia.miababy:id/text")
        wdsc[5].click() #个人中心-我的收藏点击
        sleep(6)
        actions.take_screenshot(driver)#截图 我的收藏截图

        sclb1=driver.find_elements_by_id("com.mia.miababy:id/cart_list_item_product_name")
        sclb1[0].click()#收藏商品第一个
        sleep(10)
        actions.take_screenshot(driver)#截图 商品详情截图

        addsku="com.mia.miababy:id/button_display_text"
        actions.dr(driver,addsku,0)#加入购物车
        sleep(6)
        actions.take_screenshot(driver)#截图 加购物车截图

        addcart=driver.find_elements_by_id("com.mia.miababy:id/cart")
        addcart[0].click()
        sleep(6)
        actions.take_screenshot(driver)#截图 购物车截图
        product_price ="com.mia.miababy:id/pay_price_textView"
        actions.check(self,driver,product_price,"¥69")

        cart_checkou="com.mia.miababy:id/checkout_textView"
        actions.dr(driver,cart_checkou,0)




