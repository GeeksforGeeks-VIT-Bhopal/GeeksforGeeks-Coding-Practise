# Express N as sum of 4 prime numbers
Given a number N, the task is to express N as a summation of 4 positive primes.
 
**Example 1:**
```
Input: N = 8
Output: 2 2 2 2
Explanation: 2 is prime and 2 + 2 + 2 + 2 = 8
```
**Example 2:**
```
Input: N = 15
Output: 2 3 3 7
Explanation: 2, 3 and 7 are prime and 2 + 3 + 
+ 3 + 7 = 15.
```
**Your Task:**<br>
You don't need to read or print anything. Your task is to complete the function **Express()** which takes N as input parameter and returns a list of four number if N can be expressed as a summation of four numbers otherwise returns a list containing -1. The returned list should be in increasing order. If there are more than one list possible then returns the lexicograhically smallest one.
 
**Expected Time Complexity:** O(N*log(N))<br>
**Expected Space Complexity:** O(N)
