#coding=utf-8
import unittest
import HTMLTestRunner,sys,os
import datetime
#import self as self
from Shopping_Cart import item_checkout
from Shopping_Cart import seach
from Shopping_Cart import order_checkout
from common import connect
from GlobalParams import driver
from common import report
from common import actions
from common import logger
import  logging
import sys



if __name__ == '__main__':
    # add cases to suit
    x = driver.get_window_size()
    width = x['width']
    height = x['height']
    print(width,height)
    filePath = "D:\\MIAUIAUTO\\report\\"
    filePaths=filePath+"测试截图"
    actions.mkdir(filePaths)
    filePaths1=os.path.abspath
    print(filePaths1)
    #log=logger.Logger(logger="suitCheckout")
    def suiteShoppingCart():
        suiteTest = unittest.TestSuite()
        suiteTest.addTest(item_checkout.itemCheckout('intoShoppingCart'))
        logging.info("执行进入购物用例")
        suiteTest.addTest(item_checkout.itemCheckout('CartClear'))
        suiteTest.addTest(item_checkout.itemCheckout('login'))
        suiteTest.addTest(item_checkout.itemCheckout('addcart'))
        return suiteTest

    def suitCheckout():
        suiteTest = unittest.TestSuite()
        suiteTest.addTest(order_checkout.order_checkout('order_checkout'))
        return suiteTest
    # add suit to allsuit
    def suiteSeach():
        suiteTest = unittest.TestSuite()
        suiteTest.addTest(seach.seach('seachcheck'))
        return suiteTest
    def allSuit():
        allTestSuites = []
        allTestSuites.append(suiteShoppingCart())
        allTestSuites.append(suitCheckout())
        allTestSuites.append(suiteSeach())
        allTest = unittest.TestSuite(allTestSuites)
        return allTest

    # path of result


    #close result file
    fp = report.CreateReprt()
    runner=HTMLTestRunner.HTMLTestRunner(stream=fp,title='自动化测试例结果',description=u'测试用例执行情况')
    runner.run(allSuit())
    fp.close()
    ##disconnect device
    connect.disconnects(driver)






