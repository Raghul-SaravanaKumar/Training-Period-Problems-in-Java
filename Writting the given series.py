n = int(input("Enter the length of the series: "))

print("Series:", end=" ")

odd = 1
even = 2

for i in range(1, n + 1):
    if i % 2 == 1:
        print(odd ** 3, end="")
        odd += 2
    else:
        print(even ** 2, end="")
        even += 2

    if i != n:
        print(", ", end="")
