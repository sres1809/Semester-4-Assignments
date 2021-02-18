def conversion(number):
    # Get number of digits
    # in given number
    l = len(number)

    if (l > 4):
        print("The number exceeds the limit 9999!")
        return

    # The first string is not used,
    # it is to make array indexing simple
    single_digits = ["zero", "one", "two", "three",
                     "four", "five", "six", "seven",
                     "eight", "nine"]

    # For single digit number
    if (l == 1):
        print(single_digits[ord(number[0]) - '0'])
        return

    # The first string is not used,
    # it is to make array indexing simple
    two_digits = ["", "ten", "eleven", "twelve",
                  "thirteen", "fourteen", "fifteen",
                  "sixteen", "seventeen", "eighteen",
                  "nineteen"]

    # The first two string are not used,
    # they are to make array indexing simple
    tens_multiple = ["", "", "twenty", "thirty", "forty",
                     "fifty", "sixty", "seventy", "eighty",
                     "ninety"]

    tens_power = ["hundred", "thousand"]

    # Iterate while number is not '\0'
    x = 0
    while (x < len(number)):
        # Code path for first 2 digits
        if (l >= 3):
            if (ord(number[x]) - 48 != 0):
                print(single_digits[ord(number[x]) - 48],end=" ")
                print(tens_power[l - 3], end=" ")
            l -= 1

        # Code path for last 2 digits
        else:
            # Need to explicitly handle 10-19. Sum of the two digits is used as index of "two_digits" array of strings
            if (ord(number[x]) - 48 == 1):
                sum = (ord(number[x]) - 48+ord(number[x + 1]) - 48)
                print(two_digits[sum])
                return

            # Need to explicitely handle 20
            elif (ord(number[x]) - 48 == 2 and ord(number[x + 1]) - 48 == 0):
                print("twenty")
                return

            # Rest of the two digit
            # numbers i.e., 21 to 99
            else:
                i = ord(number[x]) - 48
                if (i > 0):
                    print(tens_multiple[i], end=" ")
                else:
                    print("", end="")
                x += 1
                if (ord(number[x]) - 48 != 0):
                    print(single_digits[ord(number[x]) - 48])
        x += 1


if __name__ == "__main__":

    f = open('file_1_15.txt', 'r')
    lines = f.readlines()

    numbers = []

    for line in lines:
        words = line.strip().split()
        for word in words:
            if word.isdigit():
                numbers.append(word)

    for number in numbers:
        conversion(number)

    f.close()