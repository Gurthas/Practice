# coding = utf-8
import operator
d1 = {'id': 1, 'name':'sgj', 'age': 23}
d2 = {'id': 2, 'name':'hasi', 'age': 23}
a = d1['age']
b = d2['age']
if operator.eq(a,b):
    print('yeah')
else:
    print('what?')
