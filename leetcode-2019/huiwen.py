# coding:utf-8
#求是否是回文，不可以用字符串
class Solution:
    def hashuiwen(self,x):
        if x < 0 or x % 10 == 0 and x != 0:
            return False
        y = 0
        while x > y:
            y = x % 10 + y * 10
            x //= 10
        return x == y or x == y // 10


if __name__ == '__main__':
    sol = Solution()
    f = sol.hashuiwen(1331)
    print(f)

