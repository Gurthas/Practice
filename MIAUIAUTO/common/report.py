#coding=utf-8
import HTMLTestRunner,os,datetime,logging
#from config import config
def createReprt():
    filePath = "D:\\python workplace\\MIAUIAUTO\\report\\"
   # fp = open(filePath, 'wb')
    # 生成报告的Title,描述
    #runner = HTMLTestRunner.HTMLTestRunner(stream=fp, title='自动化测试例结果', description='购物车测试例执行结果')

    ReportTime=datetime.datetime.now()
    ReportTime=str(ReportTime.strftime('%Y-%m-%d_%H:%M:%S'))
    filename=filePath+'Report'+ReportTime+'.html'
    fp = open(filename, 'wb')
    return fp
    #fp.close()
