# coding = utf-8
import requests
import requests.cookies
import json
from connect_db import OperationMysql
import operator

def login():
    url = 'https://mdb.mia.com'
    query = '/unioncenter/plogin'
    data = {'mobile': '23511200006',
            'password':'mia123'}
    r=requests.post(url+query,data=data).text
    res = json.loads(r)
    ssq = OperationMysql().search_one("select muser_id from web_user where name = 'hasi'")
    ssq = json.loads(ssq)
    print((ssq['muser_id']))
    print((int(res['data']['user_id'])))
    if operator.eq(int(res['data']['user_id']),ssq['muser_id']):
        print('数据一致')
    else:
        print('不一致')


def get_cookie():
    url = 'https://mdb.mia.com'
    query = '/unioncenter/plogin'
    data = {'mobile': '23511200006',
            'password': 'mia123'}
    r = requests.session()
    res = r.post(url+query, data=data).text
    c = requests.cookies.RequestsCookieJar()
    c.set('cookies-name','cookies-value')
    r.cookies.update(c)
    print(res)
    print(r.cookies.get_dict())
# login()
get_cookie()

