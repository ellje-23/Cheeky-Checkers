# Cheeky-Checkers

This project was assigned by __Dr. Matthew Lang__. 
Dr. Lang provided the framework except for deque, node and dequeIterator which I had to implement.

This program plays a game similar to checkers with certain rules provided. The project focused on implementing a double-ended queue using a linked data structure.  

It requires _stdlib.jar_ which was provided by Dr. Lang. 

### Game rules

The rules are:

* On a turn, a player can move the top pieces of a pile. They can move it only as many pieces as are on the pile, and how many pieces are taken from the stack are how many spaces they move.
* If a pile lands on another, they merge, and the pieces that were moved are added to the top.
* If the new pile contains more than five pieces, pieces are removed from the bottom to make it five pieces.
* When pieces are removed, if they belong to the player, they can go into the player's reserves. Otherwise they are removed from play.
* A player can play anywhere from their reserves.
* When a player can no longer move, the game is over, and the player that can still move wins.

### To Run
1. Download the project 
2. Open the project on IntelliJ
3. Run the 'Focus.java' file
4. Play the game in the pop up window
