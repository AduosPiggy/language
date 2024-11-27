
# Set 是无序的

# add
thisset = set(("Google", "Runoob", "Taobao"))
thisset.add("Facebook")
print(thisset) # {'Runoob', 'Taobao', 'Facebook', 'Google'}

# update
thisset = set(("Google", "Runoob", "Taobao"))
thisset.update({1,3})
print(thisset) # {'Runoob', 1, 3, 'Google', 'Taobao'}

thisset.update([1,4],[5,6])  
print(thisset) # {'Runoob', 1, 3, 4, 'Google', 5, 6, 'Taobao'}


