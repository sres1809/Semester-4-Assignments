limit=input("Enter the upper limit: ")
ans = list(map(lambda x: x ** 2, filter(lambda y: y % 2 == 1, range(int(limit)+1))))
print(f"The list of all odd squares upto {limit} is: ")
print(ans)