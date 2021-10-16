# Word Search

Given a 2D board of letters and a word. Check if the word exists in the board. The word can be constructed from letters of adjacent cells only. ie - horizontal or vertical neighbors. The same letter cell can not be used more than once.
 

**Example 1:**
```
Input: board = {{a,g,b,c},{q,e,e,l},{g,b,k,s}},
word = "geeks"
Output: 1
Explanation: The board is-
a g b c
q e e l
g b k s
The letters which are used to make the
"geeks" are colored.
```
**Example 2:**
```
Input: board = {{a,b,c,e},{s,f,c,s},{a,d,e,e}},
word = "sabfs"
Output: 0
Explanation: The board is-
a b c e
s f c s
a d e e
Same letter can not be used twice hence ans is 0
``` 

**Your Task:**<br>
You don't need to read or print anything. Your task is to complete the function isWordExist() which takes board and word as input parameter and returns boolean value true if word can be found otherwise returns false.
 

**Expected Time Complexity:** O(N * M * 4L) where N = No. of rows in board, M = No. of columns in board, L = Length of word<br>
**Expected Space Compelxity:** O(L), L is length of word.
