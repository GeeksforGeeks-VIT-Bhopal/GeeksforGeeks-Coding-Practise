# Find the element that appears once
Given a sorted array A[] of N positive integers having all the numbers occurring exactly twice, except for one number which will occur only once. Find the number occurring only once.

**Example 1:**
```
Input:
N = 5
A = {1, 1, 2, 5, 5}

Output: 2

Explanation: 
Since 2 occurs once, while
other numbers occur twice, 
2 is the answer.
```
**Example 2:**
```
Input:
N = 7
A = {2, 2, 5, 5, 20, 30, 30}

Output: 20

Explanation:
Since 20 occurs once, while
other numbers occur twice, 
20 is the answer.
```
**Your Task:**<br>
You don't need to read input or print anything. Your task is to complete the function **search()** which takes two arguments(array A and integer N) and returns the number occurring only once.

**Expected Time Complexity:** O(Log(N)).<br>
**Expected Auxiliary Space:** O(1).
