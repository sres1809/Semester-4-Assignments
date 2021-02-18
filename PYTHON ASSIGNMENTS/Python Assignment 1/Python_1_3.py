import itertools
import operator

numbers=[0]*20
remainder=[0]*20

for i in range(1,21):
    numbers[i-1]=i
    remainder[i-1]=i%2

print("First 10 odd numbers: ")
odd=itertools.compress(numbers,remainder)
for i in odd:
    print(i)

for i in range(0,20):
    remainder[i]=1-remainder[i]

print("First 10 even numbers: ")
even=itertools.compress(numbers,remainder)
for i in even:
    print(i)