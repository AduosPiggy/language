
# remove
thisset = set(("Google", "Runoob", "Taobao"))
thisset.remove("Taobao")
print(thisset) # {'Google', 'Runoob'}
# thisset.remove("Facebook")   # 不存在会发生错误


# discard
thisset = set(("Google", "Runoob", "Taobao"))
thisset.discard("Facebook")  # 不存在不会发生错误
print(thisset) # {'Taobao', 'Google', 'Runoob'}

# pop: 随机删除集合中的一个元素
thisset = set(("Google", "Runoob", "Taobao", "Facebook"))
x = thisset.pop()
print(x)