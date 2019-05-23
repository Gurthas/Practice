def A(n):
    j=1
    for i in range(n):
        if j>n:
            j = j-2        #将j变回来，否则超值
        if i<=n//2:
            print((n-j)//2*' ',end='')      #'*'*(n-j)//2是非法的运算顺序
            print('*'*j)
            j = j+2
        else:
            j = j-2
            print((n-j)//2*' '+'*'*j)
A(5)