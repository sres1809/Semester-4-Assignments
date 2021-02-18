matrix_a= [
    [1,3,5],
    [7,9,11],
    [13,15,17]
]

matrix_b= [
    [2,4,6],
    [8,10,12],
    [14,16,18]
]

rows, cols = (3,3)
ans = [[0]*cols]*rows

print("The first matrix is: ")
for row in range(rows):
    print(matrix_a[row])

print("The second matrix is: ")
for row in range(rows):
    print(matrix_b[row])

print("The resulting matrix is: ")

for row in range(rows):
    for col in range(cols):
        ans[row][col]=0
        for k in range(cols):
            ans[row][col]+=matrix_a[row][k]*matrix_b[k][col]
    print(ans[row])



