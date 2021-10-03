# Good Pairs
Given an array of positive integers of size N. Count the number of good pairs (i,j) such that:

* 1≤ i ≤ N,
* 1≤ j ≤ N
* and arri < arrj.<br>

**Example 1**
```
Input:
N = 2
arr[] = {2, 1}  
Output: 1
Explanation : The only good pair is (2,1). 
```
**Example 2**
```
Input:
N = 3
arr[] = {2 ,3, 2}
Output: 2
Explanation: The two good pairs are (2,3) 
and (3,2).
```
**Your Task:**<br>
You don't need to read input or print anything. Your task is to complete the function **solve()** which takes the array arr[] and its size N as inputs and returns the count of good pairs as described in the problem description.

**Expected Time Complexity:** O(N log N)<br>
**Expected Auxiliary Space:** O(1)
