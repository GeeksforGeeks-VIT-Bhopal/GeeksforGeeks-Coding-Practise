# Operations on ArrayList

Given an arraylist of integers. The task is to perform operations on ArrayList according to the queries and print output for the required queries.

**Note:** use Collections.sort() to sort the list in natural order, Collections.reverseOrder() to arrange the elements in reverse, get() to return the element at index of the list, binarySearch() to find the index of the specified element in the list.

**Input Format:**<br>
First line of input contains number of testcase T. For each testcase, first line of input contains Q, number of queries. Next line contains Q queries as:

 1.a x : inserts the element x at the end of the list.

 2.i : arrange the list in increasing order.

 3.d : arrange the list in decreasing order.

 4.s y : search for the element y in the list and prints the first-index(for duplicate) (0-based indexing) of that in the list. -1 if not found.

**Output Format:**<br>
For each testcase, print the output according to the queries.

**Your Task:**<br>
Your task is to complete the functions insert(), IncOrder(), Search() and DecOrder() such that driver code will be able to perform required queries.

**Example:**<br>
**Input:**<br>
2<br>
6<br>
a 2 a 3 a 4 a 2 i s 2<br>
5<br>
a 2 a 3 a 3 d s 5<br>

**Output:**<br>
0<br>
-1<br>

**Explanation:**<br>
**Testcase 1:** After inserting elements, list is (2, 3, 4, 2) and arranging them in ascending order, we have list as (2, 2, 3, 4). Now, serching for 2, first occurence is at 0th index.

**Testcase 2:** After inserting elements, list is (2, 3, 3) and arranging them in descending order, we have list as (3, 3, 2). Finding 5 gives -1, as 5 is not present.
