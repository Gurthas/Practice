# -*- coding:utf-8 -*-
#函数式编程map()
# 利用 map()函数，把用户输入的不规范的英文名字，变为首字母大写，其他小写的规范名
# 字。输入：['adam', 'LISA', 'barT']，输出：['Adam', 'Lisa', 'Bart']。
def normal(name):
    name = name[0].upper()+name[1:].lower()
    return name
L1 = ['yUpEng', 'WANGzE', 'GUrthas', 'curry', 'JAMES']
L2 = list(map(normal, L1))
print(L2)