

f = lambda: "Hello, world!"
print(f())  # 输出: Hello, world!

x = lambda a : a + 10
print(x(5))


z = lambda a, b : a * b
print(z(5, 6))

x = lambda a, b, c : a + b + c
print(x(5, 6, 2))

numbers = [1, 2, 3, 4, 5]
squared = list(map(lambda x: x**2, numbers))
print(squared)  # 输出: [1, 4, 9, 16, 25]


numbers = [1, 2, 3, 4, 5, 6, 7, 8]
even_numbers = list(filter(lambda x: x % 2 == 0, numbers))
print(even_numbers)  # 输出：[2, 4, 6, 8]