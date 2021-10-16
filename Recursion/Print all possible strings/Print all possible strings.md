# Print all possible strings

Given a string str your task is to complete the function spaceString which takes only one argument the string str and  finds all possible strings that can be made by placing spaces (zero or one) in between them. 

For eg .  for the string abc all valid strings will be<br>
                abc<br>
                ab c<br>
                a bc<br>
                a b c

**Example 1:**
```
Input:
str = abc
Output: abc$ab c$a bc$a b c$
```
**Example 2:**
```
Input:
str = xy
Output: xy$x y$
```
**Your Task:**<br>
Complete the function spaceString() which takes a character array as an input parameter and returns list of all possible answers. The driver code will print the all possible answer '$' separated

**Expected Time Complexity:** O(N * 2^N)<br>
**Expected Auxiliary Space:** O(N)
