li= [0]*41
for i in range(0,41):
    li[i]=i

print("The multiples of 5 till 40 are: ")
multiples= list(filter(lambda x: (x%5==0), li))
for i in multiples:
    print(i)