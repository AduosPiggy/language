#!/usr/bin/python3

# for
list=[1,2,3,4]
it = iter(list)    # 创建迭代器对象
for x in it:
    print (x, end=" ")

print("\n")

#--------------------------------------------------------------------------------------------- 
# next()
import sys         # 引入 sys 模块
list=[1,2,3,4]
it = iter(list)    # 创建迭代器对象
while True:
    try:
        print (next(it), end=" ")
    except StopIteration:
        sys.exit()        