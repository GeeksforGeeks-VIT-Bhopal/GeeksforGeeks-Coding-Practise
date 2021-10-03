# Need Some Change

Given an array arr of n positive integers. The task is to swap every ith element of the array with (i+2)th element.

**Note:** When passing array to function, we basically pass the reference to the array. More details here. We'll learn more about pointers and references in upcoming module.

**Example:**
```
Input:
n = 5
arr[] = 1 2 3 4 5
Output:
3 4 5 2 1
Explanation:
Swapping 1 and 3, makes the array 3 2 1 4 5.
Now, swapping 2 and 4, makes the array 
3 4 1 2 5. Again,swapping 1 and 5, makes the 
array 3 4 5 2 1.
```
**Your Task:**<br>
Your task is to complete the function swapElements(), which should swap each ith element with (i+2)th element. No need to print or return the array.
 

**Expected Time Complexity:** O(n)<br>
**Expected Auxilary Space:** O(1)
