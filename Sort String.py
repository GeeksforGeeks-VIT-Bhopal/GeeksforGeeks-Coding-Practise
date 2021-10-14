# return string in sorted order
# ask the user for number of test cases

t = int(input('How many test cases would you like to run?\n'))
count = 0
list1 = []
while count < t:
    print('Enter string')
    string = input()
    string = string.lower()
    sort = sorted(string)
    sort = "".join(sort)
    list1.append(sort)
    count += 1
print('The strings in sorted order: ')   
for i in list1:
    print(i)
    