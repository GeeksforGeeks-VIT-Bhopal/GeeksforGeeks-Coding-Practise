# Sort in specific order
Given an array A of positive integers. Your task is to sort them in such a way that the first part of the array contains odd numbers sorted in descending order, rest portion contains even numbers sorted in ascending order.

**Example 1:**
```
Input:
N = 7
Arr = {1, 2, 3, 5, 4, 7, 10}
Output:
7 5 3 1 2 4 10
Explanation:
Array elements 7 5 3 1 are odd
and sorted in descending order,
whereas 2 4 10 are even numbers
and sorted in ascending order.
``` 
**Example 2:**
```
Input:
N = 7
Arr = {0, 4, 5, 3, 7, 2, 1}
Output:
7 5 3 1 0 2 4
``` 
**Your Task:**<br> 
You don't need to read input or print anything. Your task is to complete the function **leftIndex()** which takes the array Arr[] and its size N as inputs and modifies the array Arr[].

**Expected Time Complexity:** O(N. Log(N))<br>
**Expected Auxiliary Space:** O(N)
