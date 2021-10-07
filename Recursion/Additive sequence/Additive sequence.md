# Additive sequence

Given a string, the task is to find whether it contains an additive sequence or not. A string contains an additive sequence if its digits can make a sequence of numbers in which every number is addition of previous two numbers. You are required to complete the function which returns true if the string is a valid sequence else returns false.

**Input:**<br>
The first line of input contains an integer T denoting the no of test cases . Then T test cases follow . Each test case contains a string s .

**Output:**<br>
For each test case in a new line output will be 1 if it contains an additive sequence and 0 if it doesn't contains an additive sequence.

**Example:**<br>
**Input**<br>
3<br>
1235813<br>
1711<br>
199100199


**Output**<br>
1<br>
0<br>
1

**Explanation:**<br>
1. In first test case series will be (1 2 3 5 8 13 ) as 1+2=3, 2 + 3 = 5, 3 + 5 = 8, 5 + 8 = 13 .<br>
2. In the second test case there is no such series possible.<br>
3. In the third test case there is the series will be 1 99 100 199 .


Note:The Input/Ouput format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.
