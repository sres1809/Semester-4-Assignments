f = open('file_1_14.txt', 'r')
lines = f.readlines()
maxlen = 0

for line in lines:
    if len(line) > maxlen:
        maxlen = len(line)
maxlen -= 1

ans = []
for line in lines:
    rem = maxlen - len(line) + 1
    count = len(line.split())

    per1 = rem // (count - 1)
    per2 = rem % (count - 1)
    st = ""
    words = line.split()
    for word in words:
        st += word
        st += ' '
        for i in range(per1):
            st += ' '
        if per2 > 0:
            st += ' '
            per2 -= 1
    st.strip()
    st += '\n'
    ans.append(st)

f.close()

f = open('newfile_1_14.txt', 'w')
f.writelines(ans)
f.close()

f = open('newfile_1_14.txt', 'r')
lines = f.readlines()

for line in lines:
    print(line.strip())