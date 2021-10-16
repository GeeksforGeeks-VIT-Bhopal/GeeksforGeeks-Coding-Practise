# Fighting the darkness

Given an array arr[] of size N representing the size of candles which reduce by 1 unit each day. The room is illuminated using the given N candles. Find the maximum number of days the room is without darkness.

 

**Example 1:**
```
Input: N = 3, arr[] = {1,1,2} 
Output: 2
Explanation: The candles' length reduce 
by 1 in 1 day. So, at the end of day 1: 
Sizes would be 0 0 1, So, at end of 
day 2: Sizes would be 0 0 0. This means 
the room was illuminated for 2 days.
```
**Example 2:**
```
Input: N = 5, arr[] = {2,3,4,2,1} 
Output: 4
```
**Your Task:**<br>
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function maxDays() that takes array A[] and integer N as parameters and returns the desired output.

 

**Expected Time Complexity: O(N).**<br>
**Expected Auxiliary Space: O(1).**
