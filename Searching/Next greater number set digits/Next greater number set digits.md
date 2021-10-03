# Next greater number set digits
Given a number n, find the smallest number that has same set of digits as n and is greater than n. If n is the greatest possible number with its set of digits, report it.

**Example 1:**
```
Input:
N = 143

Output: 314

Explanation: Numbers possible with digits 
1, 3 and 4 are: 134, 143, 314, 341, 413, 431.
The first greater number after 143 is 314.
```
**Example 2:**
```
Input: 
N = 431

Output: not possible

Explanation: Numbers possible with digits
1, 3 and 4 are: 134, 143, 314, 341, 413, 431.
Clearly, there's no number greater than 431.
```
**Your Task:**<br>
You don't need to read input or print anything. Your task is to complete the function **findNext()** which takes an integer N as input and returns the smallest number greater than N with the same set of digits as N. If such a number is not possible, return -1.


**Expected Time Complexity:** O(LogN).<br>
**Expected Auxiliary Space:** O(LogN).
