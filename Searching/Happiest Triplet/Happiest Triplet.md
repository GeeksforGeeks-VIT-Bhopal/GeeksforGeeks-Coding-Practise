# Happiest Triplet 
Three arrays of the same size are given. Find a triplet such that (maximum – minimum) in that triplet is the minimum of all the triplets. A triplet should be selected in a way such that it should have one number from each of the three given arrays. This triplet is the happiest among all the possible triplets. Print the triplet in decreasing order. If there are 2 or more smallest difference triplets, then the one with the smallest sum of its elements should be displayed.

**Example 1:**
```
Input:
N=3
a[] = { 5, 2, 8 }
b[] = { 10, 7, 12 }
c[] = { 9, 14, 6 }  

Output: 7 6 5

Explanation:
The triplet { 5,7,6 }  has difference
(maximum - minimum)= (7-5) =2 which is
minimum of all triplets.  
``` 
**Example 2:**
```
Input:
N=4
a[] = { 15, 12, 18, 9 }
b[] = { 10, 17, 13, 8 }
c[] = { 14, 16, 11, 5 }

Output: 11 10 9
```
**Your Task:**<br>
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function **smallestDifferenceTriplet()** that takes array arr1 , array arr2 ,array arr3 and integer n as parameters and returns the happiest triplet in an array.

**Expected Time Complexity:** O(NLogN).<br>
**Expected Auxiliary Space:** O(1).
