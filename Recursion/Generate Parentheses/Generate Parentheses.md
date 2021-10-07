# Generate Parentheses

Given an integer N representing the number of pairs of parentheses, the task is to generate all combinations of well-formed(balanced) parentheses.


**Example 1:**
```
Input:
N = 3
Output:
((()))
(()())
(())()
()(())
()()()
```
**Example 2:**
```
Input:
N = 1
Output:
()
```
**Your Task:**<br>
You don't need to read input or print anything. Complete the function AllParenthesis() which takes N as input parameter and returns the list of balanced parenthesis.

**Expected Time Complexity:** O(2N * N).<br>
**Expected Auxiliary Space:** O(2*N*X), X = Number of valid Parenthesis.
