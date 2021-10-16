# Geeks's Garden 

Geek has a rosarium and it has N*M slots, some of them are empty and some of them have roses. Given N*M character array consists of 0's and 1's. 0 represents an empty spot and 1 represents a rose. The task is to find the maximum number of adjacent roses in geek's rosarium. For a spot (i, j) adjacent spots are (i+1, j), (i-1, j), (i, j-1), (i, j+1), (i-1, j-1), (i-1, j+1), (i+1, j-1),  and (i+1, j+1).

**Input:**
1. The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
2. The first line of each test case contains two space-separated integers N and M.
3. Next N lines consist of M characters.

**Output:** For each test case, print the maximum number of adjacent roses.


**Example:**<br>
**Input:**<br>
2<br>
2 2<br>
10<br>
01<br>
3 4<br>
1001<br>
0011<br>
0101<br>

**Output:**<br>
2<br>
5
