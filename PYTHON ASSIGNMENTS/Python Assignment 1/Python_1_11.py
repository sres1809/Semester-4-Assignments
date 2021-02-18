triplets = [(i, j, k) for i in range(1, 10) for j in range(i, 10) for k in range(j, 20)]
ans = list(filter(lambda x: x[0] * x[0] + x[1] * x[1] == x[2] * x[2], triplets))  # Filtering the Pythagorean triplets
print("The list of Pythagorean triplets is: ")
print(ans)