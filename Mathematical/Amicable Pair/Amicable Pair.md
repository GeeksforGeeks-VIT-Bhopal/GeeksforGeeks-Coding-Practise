# Amicable Pair

Amicable numbers are two different numbers so related that the sum of the proper divisors of each is equal to the other number. (A proper divisor of a number is a positive factor of that number other than the number itself. Given two Numbers A and B, find whether they are Amicable Numbers or not. Print 1 if they are Amicable else 0.

 

**Example 1:**
```
Input:
A = 220 , B = 284
Output:
1
Explanation:
Proper divisors of 220 are 1, 2,
4, 5, 10, 11, 20, 22, 44, 55 and 110.
Sum of these is 284. Proper divisors
of 284 are 1, 2, 4, 71 and 142
with sum 220.
```
**Example 2:**
```
Input:
A = 4 , B = 8
Output:
0
Explanation:
Proper divisors of 4 are 1 and 2.
Sum of these is 3!=8. Proper divisors
of 8 are 1, 2 and 4 with sum 7!=4 and
thus the Otput 0.
``` 

**Your Task:**<br>
You don't need to read input or print anything. Your task is to complete the function isAmicable() which takes 2 Integes A and B as input and returns the answer.

 

**Expected Time Complexity:** O(sqrt(A,B))<br>
**Expected Auxiliary Space:** O(1)
