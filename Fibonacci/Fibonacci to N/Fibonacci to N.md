# Fibonacci to N
Given a positive integer N. Calculate the Fibonacci series till the number N. If N is a part of the series, include N as well.

**Example 1:**
```
Input:
N = 1
Output:
0 1 1
Explanation:
Since 1 is part of the Fibonacci series,
the required series is upto 1.
```
**Example 2:**
```
Input:
N = 5
Output:
0 1 1 2 3 5
Explanation:
The required series is upto 5(since 5 is
a part of the series).
Note: The answer for N=6 and N=7
will be the same since the next term 
(i.e. 8) is greater than the 
respective Ns.
```
**Your Task:**<br>
You don't need to read input or print anything.Your Task is to complete the function **nFibonacci()** that takes an integer N as input parameter and returns a list of integers containing all terms of the fibonacci series up until N.

**Expected Time Complexity:** O(N)<br>
**Expected Auxillary Space:** O(1)
