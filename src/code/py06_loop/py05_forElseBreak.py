#!/usr/bin/python3
 
sites = ["Baidu", "Google","Runoob","Taobao"]
for site in sites:
    if site == "Runoob":
        print("Runoob!")
        break
    print("循环数据 " + site)
else:
    print("没有循环数据!")
print("完成循环!")