# String Permutations

Given a string S. The task is to find all permutations of a given string.

**Example 1:**
```
Input:
S = ABC
Output: ABC ACB BAC BCA CAB CBA
```
**Example 2:**
```
Input:
S = ABSG
Output: ABGS ABSG AGBS AGSB ASBG ASGB
BAGS BASG BGAS BGSA BSAG BSGA GABS
GASB GBAS GBSA GSAB GSBA SABG SAGB
SBAG SBGA SGAB SGBA
``` 

**Your Task:**<br>
This is a function problem. You only need to complete the function permutation that takes S as parameter and returns the list of permutations in lexicographically increasing order. The newline is automatically added by driver code.

**Expected Time Complexity:** O(N * N!), N = length of string.<br>
**Expected Auxiliary Space:** O(1)
