# Collection of pens
There are three piles of pens. A pens in the first pile and B pens in the second Pile.Find the minimum number of pens that should be there in the third pile so that sum of all three piles produces a prime number.<br>
**Note:** there should be atleast one pen in the third pile.

**Example 1:**
```
Input: A = 1, B = 3
Output: 1
Explanation: A + B + K = prime
K = 1, 1 + 3 + 1 = 5.So answer = 1
becuase 5 is minimum possible prime. 
```
**Example 2:**
```
Input: A = 4, B = 3
Output: 4
Explanation: A + B + K = prime
K = 4, 4 + 3 + 4 = 11.So answer = 4
becuase 11 is minimum possible prime.
```
**Your Task:**<br>
You dont need to read input or print anything. Complete the function **minThirdPiles()** which takes A and B as input parameter and returns the the minimum number of pens that should be there in the third pile so that sum of all three piles produces a prime number.

**Expected Time Complexity:** O(nlogn)<br>
**Expected Auxiliary Space:** O(1)
