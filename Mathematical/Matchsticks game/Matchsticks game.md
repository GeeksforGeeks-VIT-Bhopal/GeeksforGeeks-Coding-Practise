# Matchsticks game

Two friends, A and B, are playing the game of matchsticks. In this game, a group of N matchsticks is placed on the table. The players can pick any number of matchsticks from 1 to 4 (both inclusive) during their chance. The player who takes the last match stick wins the game. If A starts first, how many matchsticks should he pick such that he is guaranteed to win the game or determine if it's impossible for him to win.<br>
**Note :** Consider both A and B play the game optimally.

 
**Example 1:**
```
Input:
N = 48
Output:
3
Explanation:
Player A is guaranteed a win if he
picks 3 matchsticks first.
```
**Example 2:**
```
Input:
N = 15
Output:
-1
Explanation:
Player A is guaranteed a loss no matter
how many matches he picks at first.
```

**Your Task:**<br>
You don't need to read input or print anything. Your task is to complete the function matchGame() which takes an Integer N as input and returns the answer.

 

**Expected Time Complexity:** O(1)<br>
**Expected Auxiliary Space: **O(1)
