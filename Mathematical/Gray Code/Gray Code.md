# Gray Code

You are given a decimal number n. You need to find the gray code of the number n and convert it into decimal.

Gray code is a binary numeral system where two successive values differ in only one bit.<br>
For example, the sequence of Gray codes for 3-bit numbers is: 000, 001, 011, 010, 110, 111, 101, 100, so G(4)=6.

**Example 1:**
```
Input:
n  = 7
Output:
4
Explanation:
7 is represented as 111 in binary form.
The gray code of 111 is 100, in the binary
form whose decimal equivalent is 4.
```
**Example 2:**
```
Input:
n  = 10
Output:
15
Explanation:
10 is represented as 1010 in binary form.
The gray code of 1010 is 1111, in the binary
form whose decimal equivalent is 15.
``` 

**Your Task:**<br>
You don't need to read input or print anything. Your task is to complete the function getGray() which takes an Integer n as input and returns the answer.

 

**Expected Time Complexity:** O(1)<br>
**Expected Auxiliary Space:** O(1)
