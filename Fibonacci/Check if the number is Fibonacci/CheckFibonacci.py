n = int(input("Enter the number you want to check: "))
f3 = 0
f1 = 1
f2 = 1
if (n == 0 or n == 1):
    print("Given number is fibonacci number")
 
else:
    while f3 < n:
        f3 = f1 + f2
        f2 = f1
        f1 = f3
    if f3 == n:
        print("Given number is fibonacci number")
    else:
        print("No it’s not a fibonacci number")
