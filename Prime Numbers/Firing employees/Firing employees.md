# Firing employees
Geek is the founder of Geek Constructions. He always maintains a black-list of potential employees which can be fired at any moment.

The company has N employees (including Geek), and each employee is assigned a distinct rank (1 <= rank <= N) at the time of joining. The company has a hierarchical  management such that each employee always has one immediate senior. 

Geek has a strange and unfair way of evaluating an employee’s performance. He sums the employee's rank and the number of seniors the employee has. If it is a prime number, the employee is put up on the black-list.

Given an array arr[] in order of the rank of company employees. For rank i, arr[i] represents the rank of the immediate senior of the employee with the ith rank. If geek's rank is i, then arr[i] is always equal to 0 as there is noone senior to him. Find out the number of Black-Listed employees.

**Note:** The black-list can not contain Geek’s name as he is the founder of the company and he is the one that makes the list.

**Example 1:**
```
Input:
N = 4
arr[] = {0, 1, 1, 2}

Output: 1

Explanation:
The hierarchy is as follows

       (Geek)
       Rank 1
        /   \
  Rank 2     Rank 3  
      /
Rank 4

Performance = rank + number of seniors
Performance for rank 1 = not considered.
Performance for rank 2 = 2+1 = 3 (prime)
Performance for rank 3 = 3+1 = 4 (not prime)
Performance for rank 4 = 4+2 = 6 (not prime)
Therefore, only employee 2 is black-listed.
```
**Example 2:**
```
Input:
N = 3
arr[] = {2, 3, 0}

Output: 2

Explanation: 
The hierarchy is as follows

       (Geek)
       Rank 3
        /   
  Rank 2     
      /
Rank 1

Rank 1 and 2 are both black-listed.
```
**Your Task:**<br> 
You don't need to read input or print anything. Your task is to complete the function **firingEmployees()** which takes the array arr[] and its size N as input parameters. It returns the number of black-listed employees. 

**Expected Time Complexity:** O(N)<br>
**Expected Auxiliary Space:** O(N)
