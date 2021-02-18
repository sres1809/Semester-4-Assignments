def mySort(**kwargs):
    # this function sorts a list of integers
    myList = []
    sort_type = False  # False for ascending order sorting
    count = 0
    for key, value in kwargs.items():
        if count == 0:
            myList = value
            count += 1
        else:
            sort_type = value

    n = len(myList)
    # simple bubble sort
    for i in range(n - 1):
        for j in range(0, n - i - 1):
            if myList[j] > myList[j + 1]:
                myList[j], myList[j + 1] = myList[j + 1], myList[j]

    # reverse the string if the sortType bit is set
    if sort_type:
        myList.reverse()
    if sort_type:
        print("sorted in descending order: ")
    else:
        print("Sorted in ascending order: ")
    print(myList)


if __name__ == "__main__":

    myList = []
    n = int(input("Enter a number: "))
    print(f"Enter {n} number(s): ")

    for i in range(0, n):
        m = int(input())
        myList.append(m)

    kwargs = {"list": myList, "type": True}

    mySort(**kwargs)