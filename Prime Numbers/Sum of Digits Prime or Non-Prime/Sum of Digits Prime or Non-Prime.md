# Sum of Digits Prime/Non-Prime
Given a number N, you need to write a program that finds the sum of digits of the number till the number becomes a single digit and then check whether the number is Prime/Non-Prime.

**Example 1:**
```
Input:
N=5602
Output:
0
Explanation:
1st step=5+6+0+2=13
2nd step=1+3=4
Since 4 is not prime, so answer is 0.
```
**Example 2:**
```
Input:
N=12
Output:
1
Explanation:
1st step=1+2=3
Since, 3 is prime, so answer =1.
```
**Your Task:**<br>
You don't need to read input or print anything.Your Task is to complete the function **digitPrime()** which takes a number N as input parameter and returns 1 if the final digit sum(adding digits until it becomes single-digit number) is prime.Otherwise, it returns 0.

**Expected Time Complexity:** O(1)<br>
**Expected Auxillary Space:** O(1)
