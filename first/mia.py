# coding = utf-8
import requests
url = 'https://www.mia.com'
query = '/order_lists'
data = {'mobile': '23511200006',
        'password':'mia123'}
r=requests.get(url+query).text
print(r)
