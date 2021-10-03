# Number and the Digit Sum 
Given a positive value N, we need to find the count of numbers smaller than and equal to N such that the difference between the number and sum of its digits is greater than or equal to given specific value K.

**Example 1:**
```
Input:
N = 13, K = 2

Output: 4

Explanation: 10, 11, 12 and 13 satisfy the given
condition shown below,
10 – sumofdigit(10) = 9 >= 2
11 – sumofdigit(11) = 9 >= 2
12 – sumofdigit(12) = 9 >= 2
13 – sumofdigit(13) = 9 >= 2  
```
**Example 2:**
```
Input: 
N = 10, K = 5

Output: 1

Explanation: Only 10 satisfies the given
condition as 10 - sumofdigit(10) = 9 >= 5
```
**Your Task:**<br>
You don't need to read input or print anything. Your task is to complete the function **numberCount()** which takes an integer N and an integer K as inputs and returns the count of numbers less than or equal to N such that the difference between the number and its sum of digits is greater than K.


**Expected Time Complexity:** Log (N).<br>
**Expected Auxiliary Space:** O(1).
