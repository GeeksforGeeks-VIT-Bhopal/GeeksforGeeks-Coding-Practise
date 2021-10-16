# Ishaan's Internship
Ishaan wants to intern at GeeksForGeeks but for that he has to go through a test. There are n candidates applying for the internship including Ishaan and only one is to be selected.<br>
Since he wants to qualify he asks you to help him. The test is as follows-
The candidates are asked to stand in a line at positions 1 to n and given a number k. Now, every kth candidate remains and the rest are eliminated. This is repeated until the number of candidates are less than k.<br>
Out of the remaining candidates, the one standing at smallest position is selected. You need to tell Ishaan at position he must stand to get selected.

**Example 1:**
```
Input 
n = 30
k = 3

Output 
27

Explaination 
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30
3 6 9 12 15 18 21 24 27 30
9 18 27
27
```
**Example 2:**
```
Input 
n = 18
k = 3

Output  
9

Explaination 
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
3 6 9 12 15 18
9 18 (less than k)
9
```
**Your Task :**<br>
You don't need to read input or print anything. Your task is to Complete the function **getCandidate()** which takes two integer n and k as input parameters, and returns the answer.

**Expected Time Complexity:** O(logkn)<br>
**Expected Auxiliary Space:** O(1)
