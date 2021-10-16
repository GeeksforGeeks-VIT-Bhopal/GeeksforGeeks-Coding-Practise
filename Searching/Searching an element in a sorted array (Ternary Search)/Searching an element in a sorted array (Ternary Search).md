# Searching an element in a sorted array (Ternary Search)

Given a sorted array arr[] of size N and an integer K. The task is to check if K is present in the array or not using ternary search.<br>

**Ternary Search-** It is a divide and conquer algorithm that can be used to find an element in an array. In this algorithm, we divide the given array into three parts and determine which has the key (searched element).

**Example 1:**
```
Input:
N = 5, K = 6
arr[] = {1,2,3,4,6}

Output: 1

Exlpanation: Since, 6 is present in 
the array at index 4 (0-based indexing),
output is 1.
```
**Example 2:**
```
Input:
N = 5, K = 2
arr[] = {1,3,4,5,6}

Output: -1

Exlpanation: Since, 2 is not present 
in the array, output is -1.
```
**Your Task:**<br>
You don't need to read input or print anything. Complete the function **ternarySearch()** which takes the sorted array arr[], its size N and the element K as input parameters and returns 1 if K is present in the array, else it returns -1. 

**Expected Time Complexity:** O(Log3N)<br>
**Expected Auxiliary Space:** O(1)
