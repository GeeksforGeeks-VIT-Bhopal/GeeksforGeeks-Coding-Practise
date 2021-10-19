n = int(input("Enter the nth value: "))
i = 2
fib1, fib2 = 1,1 #two last values that we need to calculate the last Fibonacci's number before n
if (n == 0) or (n == 1): #when there isn't 3 numbers to compare
    fib2 = n
else:
    while (i < n):
        tmp = fib2 #to have the value the time to change other values
        fib2 = fib1 + fib2
        fib1 = tmp
        i += 1
print("The last Fibonacci's number before ", n, "is ", fib2,".") #the last Fibonacci's number before n
