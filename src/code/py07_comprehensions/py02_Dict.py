listdemo = ['Google','Runoob', 'Taobao','kkkkkfffflllsso']
# 将列表中各字符串值为键，各字符串的长度为值，组成键值对
newdict = {key:len(key) for key in listdemo}
print(newdict) # {'Google': 6, 'Runoob': 6, 'Taobao': 6}