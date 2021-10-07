# Lucky Numbers

Lucky numbers are subset of integers. Rather than going into much theory, let us see the process of arriving at lucky numbers,<br>
Take the set of integers<br>
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,……<br>
First, delete every second number, we get following reduced set.<br>
1, 3, 5, 7, 9, 11, 13, 15, 17, 19,…………<br>
Now, delete every third number, we get<br>
1, 3, 7, 9, 13, 15, 19,….….<br>
Continue this process indefinitely……<br>
Any number that does NOT get deleted due to above process is called “lucky”.<br>

**Example 1:**
```
Input:
N = 5
Output: 0
Explanation: 5 is not a lucky number 
as it gets deleted in the second 
iteration.
```
**Example 2:**
```
Input:
N = 19
Output: 1
Explanation: 19 is a lucky number
```
**Your Task:**<br>
You don't need to read input or print anything. You only need to complete the function isLucky() that takes N as parameter and returns either False if the N is not lucky else True.

**Expected Time Complexity:** O(sqrt(N)).<br>
**Expected Auxiliary Space:** O(sqrt(N)).
