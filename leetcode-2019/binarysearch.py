#二分查找
def binaryserch(nums,target):
    low = 0
    high = len(nums)-1

    while low <= high:
        middle = low+high//2
        if nums[middle] == target:
            print('find it,it is in the middle')
            return middle
        elif nums[middle]<target:
            low = middle+1
            print('find it,it is in the high')
        else:
            high = middle-1
            print('in the low')
        return nums.index(target)
nums = [1,2,6,34,65,88,123]
f = binaryserch(nums, 88)
print(f)


