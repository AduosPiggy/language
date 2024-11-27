
# 选出names中名字长度>3的，然后转换为大写,最终存储在new_names中;
names = ['Bob','Tom','alice','Jerry','Wendy','Smith']
new_names = [name.upper()for name in names if len(name)>3]
print(new_names) # ['ALICE', 'JERRY', 'WENDY', 'SMITH']
