# coding:utf-8
#求最大子序列的和
class Solution:
    def codingsum(self, nums):
        sum = 0
        max_sum = nums[0]
        for num in nums:
            sum += num

            if sum  > max_sum:
                max_sum = sum
            elif sum < 0:
                sum = 0
        return max_sum
if __name__ == '__main__':
    sol = Solution()
    nums = [-1,-3,0,-1]
    sss = sol.codingsum(nums)
    print(sss)