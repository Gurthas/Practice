# coding = utf-8
#101-201之间的素数
from math import sqrt
# ecoding=utf-8
# 安装楼上的说法，这样就对了！
primes = []
for i in range(101,200):
    for j in range(2,i):
        if i % j ==0:
            break
    else:
        primes.append(i)
print(len(primes))    # 计算个数
print(primes)
