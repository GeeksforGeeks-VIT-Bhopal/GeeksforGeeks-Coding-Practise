# Circular Prime Number
A prime number is a **Circular Prime Number** if all of its possible rotations are itself prime numbers. Now given a number N check if it is Circular Prime or Not.

**Example 1:**
```
Input: N = 197
Output: 1
Explanation: 197 is a Circular Prime because
all rotations of 197 are 197, 719, 971 all of 
the 3 are prime number's hence 197 is a 
circular prime.
```
**Example 2:**
```
Input: N = 101
Output: 0
Explanation: 101 and 11 is prime but 110 is
not a prime number.
```
**Your Task:**<br>
You don't need to read or print anything. Your task is to complete the function **isCircularPrime()** which takes N as input parameter and returns 1 if it is Circular Prime otherwise returns -1.
 
**Expected Time Complexity:** O(Nlog(log(N))<br>
**Expected Space Complexity:** O(N)
