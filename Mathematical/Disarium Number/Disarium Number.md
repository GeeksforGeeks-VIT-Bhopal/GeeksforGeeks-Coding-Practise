# Disarium Number

Given a number N, find if it is Disarium or not. A number is called Disarium if sum of its digits powered with their respective positions is equal to the number itself. Output 1 if it's Disarium, and 0 if not.


**Example 1:**
```
Input:
N = 89
Output:
1
Explanation:
8^1+9^2 = 89 thus output is 1.
```
**Example 2:**
```
Input:
N = 81
Output:
0
Explanation:
8^1+1^2 = 9 thus output is 0. 
```

**Your Task:**<br>
You don't need to read input or print anything. Your task is to complete the function isDisarium() which takes an Integer N as input and returns the answer.

 
**Expected Time Complexity:** O(log(N))<br>
**Expected Auxiliary Space:** O(1)
