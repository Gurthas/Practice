import requests
from diaobi1 import SharkClient
import unittest
_DEVICE_ID = 'Test-device'
url  = 'http://dev.shark.kuaikuaiyu.com/api.shop.list?platform=android&version=0,21'
postmessage ={
    'area_id':'566e800738a2127e2686f9f8'          
    }
common_Querry = {          
    'platform': 'android',
    'version': '0,20',
    'did': _DEVICE_ID
    }
r = requests.post(url,postmessage)
print r.text

