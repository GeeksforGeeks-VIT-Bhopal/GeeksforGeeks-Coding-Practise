# Decode the string

An encoded string (s) is given, the task is to decode it. The pattern in which the strings were encoded were as follows<br>
**original string:** abbbababbbababbbab<br>
**encoded string :** 3[a3[b]1[ab]]

**Example 1:**
```
Input: s = 1[b]
Output: b
Explaination: 'b' is present only one time.
```
**Example 2:**
```
Input: s = 3[b2[ca]]
Output: bcacabcacabcaca
Explaination: 2[ca] means 'ca' is repeated 
twice which is 'caca' which concatenated with 
'b' becomes 'bcaca'. This string repeated 
thrice becomes the output.
```
**Your Task:**<br>
You do not need to read input or print annything. Your task is to complete the function decodedString() which takes s as input parameter and returns the decoded string.

**Expected Time Complexity:** O(|s|)<br>
**Expected Auxiliary Space:** O(|s|)
