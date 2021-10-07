# Ordered Prime Signature
Given a number n, find the ordered prime signatures and find the number of divisor of n.Any positive integer, ‘n’ can be expressed in the form of its prime factors. If ‘n’ has p1, p2,  etc. as its prime factors, then n can be expressed as :<br>
n = {p_1}^{e1} * {p_2}^{e2} * ...<br>
Arrange the obtained exponents of the prime factors of ‘n’ in non-decreasing order. The arrangement thus obtained is called the ordered prime signature of the positive integer ‘n’.

**Example 1:**
```
Input: n = 20
Output: 1 2
        6
Explaination: 20 can be written as 22 * 5. The 
ordered pair is 2 1 and the factors are 1, 2, 4, 
5, 10, 20.
```
**Example 2:**
```
Input: n = 13
Output: 1
        2
Explaination: 13 itself is a prime number 
and it has two factors 1 and 13.
```
**Your Task:**<br>
You do not need to read input or print anything. Your task is to complete the function **orderedPrime()** which takes n as input parameter and returns a list containing the powers in non-decreasing manner and the number of factors at the end of the list. The driver code will itself print the number of factors (last element of the returned list) in a new line.

**Expected Time Complexity:** O(nsqrt(n))<br>
**Expected Auxiliary Space:** O(n)
