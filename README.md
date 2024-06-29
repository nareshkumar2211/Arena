<body>
  <h1>Magical Arena</h1>

  <h2>Description</h2>
  <p>Magical Arena is a Java-based game simulation where players battle using various attributes such as health, strength, and attack.</p>

  <h2>How to Run</h2>
  <ol>
    <li>Open your terminal or command prompt.</li>
    <li>Navigate to the directory where <code>Main.java</code> is located.</li>
    <li>Compile the <code>Main.java</code> file using <code>javac</code>:</li>
  </ol>
  <pre><code>javac Main.java</code></pre>
  <ol start="4">
    <li>Run the compiled Java program:</li>
  </ol>
  <pre><code>java Main</code></pre>

  <h3>Player.java</h3>
  <h4>Class:</h4>
  <ul>
    <li>The <code>Player</code> class is defined with the public access modifier.</li>
  </ul>

  <h4>Object (Instance):</h4>
  <ul>
    <li>Objects of the <code>Player</code> class are created using the constructor <code>public Player(String name, int health, int strength, int attack)</code>.</li>
  </ul>

  <h4>Encapsulation:</h4>
  <ul>
    <li>Data hiding and encapsulation are achieved by making the fields private (<code>private int health, private int strength, private int attack, private String name</code>).</li>
  </ul>

  <h4>Constructor:</h4>
  <ul>
    <li>The constructor <code>public Player(String name, int health, int strength, int attack)</code> initializes the state of each <code>Player</code> object when instantiated.</li>
  </ul>

  <h4>Methods:</h4>
  <ul>
    <li>Instance Methods: <code>toString()</code>, <code>getHealth()</code>, <code>isAlive()</code>, <code>receiveDamage(int damage)</code>, <code>attack(int diceRoll)</code>, <code>defend(int diceRoll)</code> are instance methods because they operate on specific instances of the <code>Player</code> class.</li>
  </ul>

  <h3>Main.java</h3>
  <h4>Classes and Objects:</h4>
  <ul>
    <li>Class Definition: The <code>Player</code> class and the <code>Main</code> class are defined.</li>
    <li>Object Creation: Objects <code>playerA</code> and <code>playerB</code> of the <code>Player</code> class are created in the <code>main</code> method.</li>
    <li>Instance Variables: <code>playerA</code>, <code>playerB</code>, and <code>random</code> are instance variables of the <code>Main</code> class.</li>
  </ul>

  <h4>Polymorphism:</h4>
  <ul>
    <li>Method Overriding: In the <code>Player</code> class, methods like <code>attack</code>, <code>defend</code>, and <code>receiveDamage</code> can be overridden in subclasses to provide different behaviors for different types of players.</li>
  </ul>

  <h2>Unit Tests</h2>
  <ul>
    <li>Unit tests have been added for <code>Player.java</code> and <code>Main.java</code> to ensure code functionality and reliability.</li>
  </ul>
</body>
