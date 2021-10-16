# check perfect square using addition or substraction
# return 1 if perfect square else 0 if not a perfect square
# n^2 should be equal to sum of first n odd numbers to be a perfect square

def isPerfectSquare(num):
    oddsum = 0
    x = int(num**0.5)
    for i in range(1, (2*x +1), 2):  #to sum odd numbers
        oddsum += i
    if oddsum == num:
        return 1
    else:
        return 0

#asks user for input   
num = int(input('Enter number: '))
#prints result
print(isPerfectSquare(num))