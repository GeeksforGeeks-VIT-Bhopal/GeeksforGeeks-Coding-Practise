# Twisted Prime Number
Given a number N. Check whether N is a Twisted Prime number or not.<br>
**Note:** A number is called Twisted Prime if it is a prime and its reverse is also a prime.

**Example 1:**
```
Input: N = 97
Output: 1
Explanation: 97 is a prime number. Its 
reverse 79 is also a prime number. Thus 
97 is a  twisted Prime and so, answer is 1.
```
**Example 2:**
```
Input: N = 43
Output: 0
Explanation: 43 is a prime number but its 
reverse 34 is not a prime.So, 43 is not a 
twisted prime and thus, answer is 0.
```
**Your Task:**<br>
You don't need to read input or print anything.Your task is to complete the function **isTwistedPrime(**) which takes a number N as input parameter and returns 1 if it is a twisted prime number.Otherwise, it returns 0.

**Expected Time Complexity:** (O(sqrt(max(N,RevN))), here RevN is the reverse of N.<br>
**Expected Space Complexity:** O(1)
