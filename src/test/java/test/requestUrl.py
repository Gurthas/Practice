import requests
import time
print time.time()
url='http://dev.shark.kuaikuaiyu.com/api.login.sms?version=0,17&distribution=nightly'
loginSms = {
    #'version': '0,17',
    #'distribution': 'nightly',
    'mobile': '13720079874',
    'sms_token': time.time(),
    'sid': 'fuckId'
}

r = requests.post(url, loginSms)

print r.text
url2 = 'http://dev.shark.kuaikuaiyu.com/debug.code.query?mobile=13720079874'
x = requests.get(url2)
print x.text
verify_code = x.text[-4:]
print verify_code

login_info = {
    'mobile': '13720079874',
    'code': verify_code,
    'user_token': 'test_usertoken',
    'device_token': 'test_devicetoken',
    'rdid': 'test_rdid',
    'bb': 'blackbox',
}
url3 = 'http://dev.shark.kuaikuaiyu.com/api.login?version=0,17&distribution=nightly&platform=ios'
z = requests.post(url3, login_info)
print z.text
