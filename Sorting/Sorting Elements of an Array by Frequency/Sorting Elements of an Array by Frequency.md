# Sorting Elements of an Array by Frequency
Given an array of integers, sort the array according to frequency of elements. That is elements that have higher frequency come first. If frequencies of two elements are same, then smaller number comes first.

**Example 1:**
```
Input:
N = 5
A[] = {5,5,4,6,4}
Output: 4 4 5 5 6
Explanation: The highest frequency here is
2. Both 5 and 4 have that frequency. Now
since the frequencies are same then 
smallerelement comes first. So 4 4 comes 
firstthen comes 5 5. Finally comes 6.
The output is 4 4 5 5 6.
```
**Example 2:**
```
Input:
N = 5
A[] = {9,9,9,2,5}
Output: 9 9 9 2 5
Explanation: The highest frequency here is
3. The element 9 has the highest frequency
So 9 9 9 comes first. Now both 2 and 5
have same frequency. So we print smaller
element first.
The output is 9 9 9 2 5.
```
**Your Task:**<br>
You only need to complete the **function sortByFreq** that takes arr, and n as parameters and returns the sorted array.

**Expected Time Complexity:** O(NLogN).<br>
**Expected Auxiliary Space:** O(N). 
