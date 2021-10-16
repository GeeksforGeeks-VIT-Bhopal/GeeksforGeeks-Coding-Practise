# Parity of unsigned integer

Given an integer N, find it's parity. 
Parity of a number refers to the number of 1 bits it contains. The number has “odd parity”, if it contains odd number of 1-bits and is “even parity” if it contains even number of 1-bits.

**Example 1:**
```
Input:
N = 13
Output: odd
Explanation:
(13)10 = (1101)2  The binary representation
has three 1-bits. So, it's parity is odd.
```
**Example 2:**
```
Input:
N = 9
Output: even
Explanation:
(9)10 = (1001)2  The binary representation
has two 1-bits. So, it's parity is even.
``` 

**Your Task:**<br>
You don't need to read input or print anything. Your task is to complete the function computeParity() which takes an Integer N as input parameter and returns string "odd" or "even".

 

**Expected Time Complexity:** O(log(N))<br>
**Expected Auxiliary Space:** O(1)
