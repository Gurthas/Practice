# coding = utf-8
a = [2,3,6,8,9]
def binary_Search(a, n):
    low = 0
    high = len(a) - 1
    while low <= high:
        middle = (low + high) // 2
        if a[middle] == n:
            print('find it')
            return middle + 1
        elif a[middle] < n:
            low = middle + 1
        else:
            high = middle - 1
    print('find failed')
    return -1

print(binary_Search(a, 3))
