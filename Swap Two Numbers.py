#Swap two numbers without using a temporary variable

def get(num1, num2):
    num1 , num2 = num2, num1
    return (num1, num2)

num1 = int(input('Enter first number: '))
num2 = int(input('Enter second number: '))
print(get(num1, num2))