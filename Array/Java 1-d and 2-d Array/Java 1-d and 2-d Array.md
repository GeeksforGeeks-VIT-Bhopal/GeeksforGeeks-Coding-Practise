# Java 1-d and 2-d Array 

Given a integer n. We have n*n values of a 2-d array, and  n values of 1-d array. Task is to find the sum of the left diagonal values of the 2-d array and the max element of the 1-d array and print them with space in between.

**Example 1:**
```
â€‹Input : arr[][] = {{1,2,3}, {4,5,6}, {7, 8,9}} 
        and N = 3
brr[] = {3, 6, 9}
Output : 15 9
Explanation:
1 2 3
4 5 6
7 8 9
So, this sum of left diagonal (1+ 5 + 9) = 15
The maximum element in an array brr is 9
So, will return {15, 9} as an answer.
```
**â€‹Example 2:**
```
Input : arr[][] = {{1,2}, {1, 2}} and N = 2
brr[] = {10, 1} 
Output :  3 10 
``` 

**Your Task:**<br>
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function array() that takes a two-dimension array (a), another one dimension array (b), sizeOfArray (n), and return the ArrayList which is having the sum of the diagonal elements of the array a and the maximum number of the array b. The driver code takes care of the printing.

**Expected Time Complexity: O(N2).**<br>
**Expected Auxiliary Space: O(1).**


 

**Constraints**<br>
1 ≤ n ≤ 100<br>
1 ≤ a[i][j], b[i] ≤ 10^3
