# Matching Pair 

Given a set of numbers from 1 to N, each number is exactly present twice so there are N pairs. In the worst-case scenario, how many numbers X should be picked and removed from the set until we find a matching pair?

**Example 1:**
```
Input:
N = 1
Output:
2
Explanation:
When N=1 Then there is 
one pair and a matching 
pair can be extracted in 
2 Draws.
```
**Example 2:**
```
Input:
N = 2
Output:
3
Explanation:
When N=2 then there are 
2 pairs, let them be {1,2,1,2}
and a matching pair will 
be made in 3 draws.
```

**Your Task:**<br>
You don't need to read input or print anything. Your task is to complete the function find() which takes an integer N as input parameter and returns an integer, the number of x must be picked and removed from set to find a matching pair.
 

**Expected Time Complexity:** O(1)<br>
**Expected Space Complexity:** O(1)
