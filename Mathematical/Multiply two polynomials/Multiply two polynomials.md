# Multiply two polynomials 

Given two polynomials represented by two arrays that contains the coefficients of poynomials, returns the polynomial in form of array formed after multiplication of given polynomials.


**Example 1:**
```
Input:
M = 4, N = 3
Arr1 = {1 , 0, 3, 2}
Arr2 = {2, 0, 4}
Output: {2, 0, 10, 4, 12, 8}
Explaination: 
First polynomial: 
1 + 0x1 + 3x2 + 2x3
Second polynomial: 
2 + 0x1 + 4x2
Product polynomial:
2 + 0x1 + 10x2 + 4x3 + 12x4 + 8x5
```
**Example 2:**
```
Input:
M = 5, N = 4
Arr1 = {1, 9, 3, 4, 7}
Arr1 = {4, 0, 2, 5}
Output: {4, 36, 14, 39, 79, 23, 34, 35}
Explaination: 
First polynomial: 
1 + 9x1 + 3x2 + 4x3 + 7x4
Second polynomial: 
4 + 0x1 + 2x2 + 5x3
Product polynomial:
4 + 36x1 + 14x2 + 39x3 + 79x4 + 23x5 + 34x6 + 35x7
```
**Your Task:**<br>
You don't need to read input or print anything. Your task is to complete the function polyMultiply() which takes the array Arr1[] and Arr2[]and their size M and N as input parameters and returns the polynomial in form of array formed after multiplication of given polynomials..


**Expected Time Complexity:** O(M*N)<br>
**Expected Auxiliary Space:** O(M*N)
