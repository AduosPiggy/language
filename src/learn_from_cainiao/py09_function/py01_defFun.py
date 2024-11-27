#!/usr/bin/python3
# compare a, b
def max(a, b):
    if a > b:
        return a
    else:
        return b
# 计算面积函数
def area(width, height):
    return width * height
# weicome
def print_welcome(name):
    print("Welcome", name) 

w = 4
h = 5

print(max(w, h))
print("width =", w, " height =", h, " area =", area(w, h))
print_welcome("Runoob")
