def toString(List):
    return "".join(List)

def permutation(li,start,end):
    if start==end:
        print(toString(li))
    else:
        for i in range(start,end+1):
            li[start], li[i] = li[i], li[start]
            permutation(li,start+1,end)
            li[start], li[i] = li[i], li[start]

str="ABCDE"
li=list(str)
print(f"The permutations of the string {str}: ")
permutation(li,0,len(str)-1)