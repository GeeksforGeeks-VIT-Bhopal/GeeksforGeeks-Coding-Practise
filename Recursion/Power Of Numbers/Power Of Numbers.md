# Power Of Numbers

Given a number and its reverse. Find that number raised to the power of its own reverse.<br>
**Note:** As answers can be very large, print the result modulo 10^9 + 7.

**Example 1:**
```
Input:
N = 2
Output: 4
Explanation: The reverse of 2 is 2
and after raising power of 2 by 2 
we get 4 which gives remainder as 
4 by dividing 1000000007.
```
**Example 2:**
```
Input:
N = 12
Output: 864354781
Explanation: The reverse of 12 is 21
and 1221 , when divided by 1000000007 
gives remainder as 864354781.
```
**Your Task:**<br>
You don't need to read input or print anything. You just need to complete the function pow() that takes two parameters N and R denoting the input number and its reverse and returns power of (N to R)mod(109 + 7).

**Expected Time Complexity:** O(LogN).<br>
**Expected Auxiliary Space:** O(LogN).
