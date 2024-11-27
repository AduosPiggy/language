#!/usr/bin/python3
 
tinydict = {'Name': 'Runoob', 'Age': 7, 'Class': 'First'}
print ("pre delete key Name",tinydict)
print ("pre delete key Name tinydict['Name']: ", tinydict['Name'])
del tinydict['Name'] # 删除键 'Name'
#tinydict.clear()     # 清空字典
#del tinydict         # 删除字典
print ("after delete key Name",tinydict)