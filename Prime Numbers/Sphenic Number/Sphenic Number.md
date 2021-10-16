# Sphenic Number
A **Sphenic Number** is a positive integer N which is product of exactly three distinct primes. The first few sphenic numbers are 30, 42, 66, 70, 78, 102, 105, 110, 114, …<br>
Given a number N, your task is to find whether it is a Sphenic Number or not.
 
**Example 1:**
```
Input: N = 30
Output: 1
Explanation: 30 = 2 * 3 * 5 so N is 
product of 3 distinct prime numbers.
```
**Example 2:**
```
Input: N = 60
Output: 0
Explanation: 60 = 2 * 2 * 3 * 5 so N is
product of 4 prime numbers.
```
**Your Task:**<br>
You don't need to read or print anyhting. Your task is to complete the function **isSphenicNo()** which takes N as input parameter and returns 1 if N is Sphenic Number otherwise returns 0.
 
**Expected Time Complexity:** O(N* log(N))<br>
**Expected Space Complexity:** O(N)
