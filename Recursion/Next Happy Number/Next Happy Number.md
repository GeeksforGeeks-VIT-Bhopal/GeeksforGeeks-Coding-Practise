# Next Happy Number

For a given non-negative integer N, find the next smallest Happy Number. A number is called happy if it leads to 1 after a sequence of steps wherein each step number is replaced by the sum of squares of its digit that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
 

**Example 1:**
```
Input:
N = 8
Output:
10
Explanation:
Next happy number
after 8 is 10 because
1*1 + 0*0 = 1
```
**Example 2:**
```
Input:
N = 10
Output
13
Explanation:
after 10, 13 is a happy
number because
1*1 + 3*3 = 10
1*1 + 0*0 = 1
```

**Your Task:**<br>
You don't need to read input or print anything. Your task is to complete the function nextHappy() which takes an integer N as input parameters and returns an integer, next Happy number after N.


**Expected Time Complexity:** O(Nlog10N)<br>
**Expected Space Complexity:** O(1)
