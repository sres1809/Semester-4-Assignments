import math

limit=input("Enter the upper limit: ")
print(f"List of prime numbers upto {limit}: ")
print("2")
for i in range(3,int(limit)+1,2):
    flag=1
    for j in range(3,int(math.sqrt(i))+1):
        if i%j==0:
            flag=0
            break
    if flag==1:
        print(i)