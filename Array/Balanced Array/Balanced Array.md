# Balanced Array

Given an array of even size N, task is to find minimum value that can be added to an element so that array become balanced. An array is balanced if the sum of the left half of the array elements is equal to the sum of right half.


**Example 1:**
```
Input:
N = 4
arr[] = {1, 5, 3, 2}
Output: 1
Explanation: 
Sum of first 2 elements is 1 + 5  = 6, 
Sum of last 2 elements is 3 + 2  = 5,
To make the array balanced you can add 1.
```
**Example 2:**
```
Input:
N = 6
arr[] = { 1, 2, 1, 2, 1, 3 }
Output: 2
Explanation:
Sum of first 3 elements is 1 + 2 + 1 = 4, 
Sum of last three elements is 2 + 1 + 3 = 6,
To make the array balanced you can add 2.
``` 

**Your Task:**<br>
You don't need to read input or print anything. Your task is to complete the function minValueToBalance() which takes the array a[] and N as inputs and returns the desired result.

 

**Expected Time Complexity: O(N)**<br>
**Expected Auxiliary Space: O(1)**
