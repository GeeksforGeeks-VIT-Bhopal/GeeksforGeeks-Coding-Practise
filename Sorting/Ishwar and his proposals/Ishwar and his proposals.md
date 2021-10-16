# Ishwar and his proposals
Ishwar has got proposals from N girls. Each girl gives him a rose with a number written on it where the number represents the popularity of that girl. Ishwar decides that he'll accept the proposal of the second most popular and the second least popular girl only. Can you help him finding the popularity of those girls?

**Note:** The popularity of all the girls are unique.

**Example 1:**
```
Input:
N = 4
arr[] = {1 2 3 4}
Output: 3 2
Explanation: 3 represents the popularity
of the second most popular girl and 2
represents the popularity of second
least popular girl.
```
**Example 2:**
```
Input:
N = 5
arr[] = {6 9 1 4 8}
Output: 8 4
Explanation: 8 represents the popularity
of the second most popular girl and 4
represents the popularity of second
least popular girl.
```
**Your Task:**<br>
You don't need to read input or print anything. Your task is to complete the function **acceptedProposals()** which takes the array arr[] and its size N as inputs and returns an array of size 2 where the 0-th element represents the popularity of the second most popular girl and the 1-st element represents the popularity of the second least popular girl.


**Expected Time Complexity:** O(N).<br>
**Expected Auxiliary Space:** O(1).
