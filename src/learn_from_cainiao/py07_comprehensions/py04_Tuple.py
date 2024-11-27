
a = (x for x in range(1,10)) # 返回的是生成器对象

print(a) # <generator object <genexpr> at 0x7faf6ee20a50> 

# 使用 tuple() 函数，可以直接将生成器对象转换成元组
print(tuple(a))  # (1, 2, 3, 4, 5, 6, 7, 8, 9)