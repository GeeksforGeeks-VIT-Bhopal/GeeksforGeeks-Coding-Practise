# Number of paths

The problem is to count all the possible paths from top left to bottom right of a MxN matrix with the constraints that from each cell you can either move to right or down.

**Example 1:**
```
Input:
M = 3 and N = 3
Output: 6
Explanation:
Let the given input 3*3 matrix is filled 
as such:
A B C
D E F
G H I
The possible paths which exists to reach 
'I' from 'A' following above conditions 
are as follows:ABCFI, ABEHI, ADGHI, ADEFI, 
ADEHI, ABEFI
``` 

**Example 2:**
```
Input:
M = 2 and N = 8
Output: 8
```
**Your Task:**<br>
You don't need to read input or print anything. Your task is to complete the function numberOfPaths() which takes the integer M and integer N as input parameters and returns the number of paths..

**Expected Time Complexity:** O(m + n - 1))<br>
**Expected Auxiliary Space:** O(1)
