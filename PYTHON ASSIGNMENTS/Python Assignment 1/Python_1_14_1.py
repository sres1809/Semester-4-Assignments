f = open('file_1_14.txt', 'r')
lines = f.readlines()

dictionary = {}
count=1
for line in lines:
    words = line.strip().split()
    for word in words:
        if word not in dictionary:
            dictionary[word]= count
            count+=1

print(dictionary)
f.close()