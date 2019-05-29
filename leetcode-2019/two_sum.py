#two sum
class Solution(object):
    def twoSum(self, nums, target):
        dict = {}
        for i, num in enumerate(nums):
            if num in dict:
                return[dict[num],i]
            else:
                dict[target-num]=i
s = Solution()
rw = s.twoSum([1,3,5,20,8,10,50,21],21)
print(rw)