# Delete middle element of a stack

Given a stack with push(), pop(), empty() operations, delete the middle of the stack without using any additional data structure.<br>
Middle: ceil(size_of_stack/2.0)
 

**Example 1:**
```
Input: 
Stack = {1, 2, 3, 4, 5}
Output:
ModifiedStack = {1, 2, 4, 5}
Explanation:
As the number of elements is 5 , 
hence the middle element will be the 3rd
element which is deleted
```
**Example 2:**
```
Input: 
Stack = {1 2 3 4}
Output:
ModifiedStack = {1 3 4}
Explanation:
As the number of elements is 4 , 
hence the middle element will be the 2nd
element which is deleted
```

**Your Task:**<br>
You don't need to read input or print anything. Complete the function deleteMid() which takes the stack and its size as input parameters and modifies the stack in-place.
**Note:** The output shows the stack from top to bottom.


**Expected Time Complexity:** O(N)<br>
**Expected Auxiliary Space:** O(N)
