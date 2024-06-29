<h3>Player.java</h3>

<h4>Class:</h4>
*The Player class is defined using the public access modifier

<h4>Object (Instance):</h4>
*Objects of the Player class are created using the constructor public Player(String name, int health, int strength, int attack).

<h4>Encapsulation:</h4>
*Data hiding and encapsulation are achieved by making the fields private (private int health, private int strength, private int attack, private String name).


<h4>Constructor:</h4>
*The constructor public Player(String name, int health, int strength, int attack) initializes the state of each Player object when it is instantiated.

<h4>Methods:</h4>
*Instance Methods: toString(), getHealth(), isAlive(), receiveDamage(int damage), attack(int diceRoll), defend(int diceRoll) are instance methods because they operate on specific instances of the Player class.

<h3>Main.java</h3>
<h4>Classes and Objects:</h4>
Class Definition: The Player class and the Main class are defined.
Object Creation: Objects playerA and playerB of the Player class are created in the main method.
Instance Variables: playerA, playerB, and random are instance variables of the Main class.

<h4>Polymorphism</h4>
Method Overriding: In the Player class, methods like attack, defend, and receiveDamage can be overridden in subclasses to provide different behaviors for different types of players.