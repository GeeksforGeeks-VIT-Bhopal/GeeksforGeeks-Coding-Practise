# Nine Divisors
Find the count of numbers less than equal to N having exactly 9 divisors.
 
**Example 1:**
```
Input:
N = 100

Output:
2

Explanation:
The two numbers which have 
exactly 9 divisors are 36 and 100.
```
**Example 2:**
```
Input:
N = 1000

Output:
8 

Explanation:
The numbers are:
36 100 196 225 256 441 484 676
```
**Your Task:**<br>  
You don't need to read input or print anything. Your task is to complete the function **nineDivisors()** which takes an integer N as an input parameter and returns the total number of elements from 1 to N inclusive, that have exactly 9 divisors.

**Expected Time Complexity:** O(sqrt(N))<br>
**Expected Auxiliary Space:**  O(sqrt(N))
