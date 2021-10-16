# Case-specific Sorting of Strings
Given a string **S** consisting of **uppercase** and **lowercase** characters. The task is to **sort** uppercase and lowercase letters **separately** such that if the ith place in the original string had an Uppercase character then it should not have a lowercase character after being sorted and vice versa.

**Example 1:**
```
Input:
N = 12
S = defRTSersUXI
Output: deeIRSfrsTUX
Explanation: Sorted form of given string
with the same case of character as that
in original string is deeIRSfrsTUX
```
**Example 2:**
```
Input:
N = 6
S = srbDKi
Output: birDKs
Explanation: Sorted form of given string
with the same case of character will
result in output as birDKs.
```
**Your Task:**<br>
You only need to complete the function caseSort that returns sorted string.

**Expected Time Complexity:** O(N*Log(N)).<br>
**Expected Auxiliary Space:** O(N).
