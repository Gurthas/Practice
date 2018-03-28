# coding=utf-8
from cgi import log

from appium import webdriver
from appium.webdriver import WebElement
from selenium import webdriver
import unittest
import datetime
import logging
import os

from time import ctime, sleep


def getSize(driver):
    x = driver.get_window_size()
    print(x)
    width = x['width']
    height = x['height']
    return (width, height)


def swipeToUp(driver, during, num):
    size = getSize(driver)
    for i in range(1, num):
        driver.swipe(size[0] / 2, size[1] * 3 / 4, size[0] / 2, size[1] / 4, during)
        sleep(1)


def swipeToDown(driver, during, num):
    size = getSize(driver)
    for i in range(1, num):
        driver.swipe(size[0] / 2, size[1] / 4, size[0] / 2, size[1] * 3 / 4, during)
        sleep(1)


def swiepToLeft(driver, during, num):
    size = getSize(driver)
    for i in range(1, num):
        driver.swipe(size[0] * 3 / 4, size[1] / 2, size[0] / 4, size[1] / 2, during)
        sleep(1)


def swipeToRight(driver, during, num):
    size = getSize(driver)
    for i in range(1, num):
        driver.swipe(size[0] / 4, size[1] / 2, size[0] * 3 / 4, size[1] / 2, during)
        sleep(1)


def check(self, driver, yqString, ResultString):
    print(self, driver, yqString, ResultString)
    yqString = driver.find_element_by_id(yqString).text
    self.assertEqual(yqString, ResultString, 'Result Fail')


def dr(driver, id, i):
    dr = driver.find_elements_by_id(id)
    dr[i].click()


def sys(driver, id, i, str):
    sys = driver.find_elements_by_id(id)
    sys[i].send_keys(str)


def is_elment_exit(driver, keywords):
    elements = driver.find_elements_by_id(keywords)
    is_exit = 0
    if len(elements):
        is_exit = 1
    else:
        is_exit = 0
    return is_exit


def take_screenshot(driver):

    filePath = "D:\\MIAUIAUTO\\Screen\\"

    Time = datetime.datetime.now()
    Time = str(Time.strftime('%Y-%m-%d_%H-%M-%S'))
    screen_name = filePath +Time + '.png'

    filePaths=filePath+"测试截图"

    mkdir(filePaths)
    filePaths1=os.path.abspath
    screen_nam1=filePaths+Time + '.png'


    try:
        driver.get_screenshot_as_file(screen_nam1)
        logging.info("开始截图并保存")

    except Exception as e:
        logging.info("出现异常", format(e))

def mkdir(path):

    filePath = "D:\\MIAUIAUTO\\Screen\\"
    # 去除首位空格
    path=path.strip()
    # 去除尾部 \ 符号
    path=path.rstrip("\\")
    # 判断路径是否存在
    # 存在     True
    # 不存在   False
    isExists=os.path.exists(path)
    # 判断结果
    if not isExists:
        # 如果不存在则创建目录
        # 创建目录操作函数
        os.makedirs(path)
        return True
    else:
        # 如果目录存在则不创建，并提示目录已存在
        return False

# 定义要创建的目录

