# Search an element in sorted and rotated array
Given a sorted and rotated array A of N distinct elements which is rotated at some point, and given an element K. The task is to find the index of the given element K in the array A.

**Example 1:**
```
Input:
N = 9
A[] = {5 6,7,8,9,10,1,2,3}
K = 10

Output: 5

Explanation: 10 is found at index 5.
```
**Example 1:**
```
Input:
N = 3
A[] = {3,1,2}
K = 1

Output: 1
```
**User Task:**<br>
Complete **Search()** function and return the index of the element K if found in the array. If the element is not present, then return -1.

**Expected Time Complexity:** O(log N).<br>
**Expected Auxiliary Space:** O(1).
