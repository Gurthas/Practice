    #coding=utf-8
from appium import webdriver
from appium.webdriver import WebElement
from selenium import webdriver
from time import ctime,sleep

#获取屏幕宽和高
def getSize(self):
    x=self.driver.get_window_size()['width']
    y=self.driver.get_window_size()['height']
    return(x,y)

#向左滑动
def swipeLeft(self,t):
    l=self.getSize()
    x1=int(l[0]*0.75)
    y1=int(l[1]*0.5)
    x2=int(l[0]*0.25)
    self.driver.swipe(x1,y1,x2,y1,t)

#向右滑动
def swipeRight(self,t):
    l=self.getSize()
    x1=int(l[0]*0.25)
    y1=int(l[1]*0.5)
    x2=int(l[0]*0.75)
    self.driver.swipe(x1,y1,x2,y1,t)
 #向上滑动
def swipeUp(self,t):
    l=self.getSize()
    x1=int(l[0]*0.5)
    y1=int(l[1]*0.75)
    y2=int(l[1]*0.25)
    self.driver.swipe(x1,y1,x1,y2,t)

#向下滑动
def swipeDown(self,t):
    l=self.getSize()
    x1=int(l[0]*0.5)
    y1=int(l[1]*0.25)
    y2=int(l[1]*0.75)
    self.driver.swipe(x1,y1,x1,y2,t)