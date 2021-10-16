# C++ Generic sort
You need to sort elements of an array where the array can be of following data-types:

* Integer
* String
* floating number

Your task is to complete the given two functions: **sortArray()** and **printArray()**.


The input line contains 2 lines. The first line contains n(size of array) and q(type of array) separated by space. Below is the description about q.

* q = 1, means elements of the array are of integer type
* q = 2, means elements of the array are of string type
* q = 3, means elements of array are of floating digit type  

The second line contains n elements of the array separated by space.

We have to print the elements in sorted form of given type of array separated by space.

**Example 1:**
```
Input:
3 3
34.23 -4.35 3.4
Output: 
-4.35 3.4 34.23 
Explanation:
The array is of floating type. After
sorting the elements of array are as
such:  -4.35 3.4 34.23
```
**Example 2:**
```
Input:
4 1
123 -2311 837 0 
Output: 
-2311 0 123 837
```
