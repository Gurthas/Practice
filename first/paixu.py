import urllib.parse
import hashlib


class Paixusuanfa:
    def paixu(self,dic):
        lis = sorted(dic.items(), key=lambda item: item[0])
        lis = urllib.parse.urlencode(lis)
        r = hashlib.md5()
        r.update(lis.encode(encoding='utf-8)'))
        r = r.hexdigest()
        print(lis)
        return r

if __name__ == '__main__':
    haha = Paixusuanfa()
    dic = {'c': 5, 'd': 2, 'a': 9, 'b': 3, 'e':13}
    print(haha.paixu(dic))
