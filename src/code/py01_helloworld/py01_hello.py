#单行注释
'''
多行注释
'''
# 1.hello world
print('-------------------------------------------------------------------------------------------')
print("hello kfflso")

# 2.if else
print('-------------------------------------------------------------------------------------------')
print("start if")
a=2
if a==1:
    print ("a=1 true")
    print ("a=1 anything else")
elif a==2:
    print ("a=2 true")
    print ("a=2 anything else")   
else:
    print ("anything else default")     
print("end if")   

# 3.String
print('-------------------------------------------------------------------------------------------')
print("start String")
str = "123456789"
print(str)                 # 输出字符串
print(str[0:-1])           # 输出第一个到倒数第二个的所有字符
print(str[0])              # 输出字符串第一个字符
print(str[2:5])            # 输出从第三个开始到第六个的字符（不包含）
print(str[2:])             # 输出从第三个开始后的所有字符
print(str[1:5:2])          # 输出从第二个开始到第五个且每隔一个的字符（步长为2）
print(str * 2)             # 输出字符串两次
print(str + '你好')         # 连接字符串
print('hello\nrunoob')      # 使用反斜杠(\)+n转义特殊字符
print(r'hello\nrunoob')     # 在字符串前面添加一个 r，表示原始字符串，不会发生转义
