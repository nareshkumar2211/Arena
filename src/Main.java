import java.util.*;
public class Main {
    private Player playerA;
    private Player playerB;
    private Random random;

    public Main(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.random = new Random();
    }

    public void run() {
        Player attacker = (playerA.getHealth() < playerB.getHealth()) ? playerA : playerB; // Select attacker based on lower health
        Player defender = (attacker == playerA) ? playerB : playerA; // Select defender based on attacker

        while (playerA.isAlive() && playerB.isAlive()) { // Continue while both players are alive
            int attackDiceRoll = random.nextInt(6)+1; // Roll a dice for attack (1 to 6)
            int defenseDiceRoll = random.nextInt(6)+1; // Roll a dice for defense (1 to 6)

            int attackDamage = attacker.attack(attackDiceRoll); // Calculate attack damage
            int defendStrength = defender.defend(defenseDiceRoll); // Calculate defense strength

            int damageTaken = Math.max(attackDamage - defendStrength, 0); // Calculate damage taken by defender

            defender.receiveDamage(damageTaken); // Apply damage to defender

            // Print attack and defense details
            System.out.println(attacker + " attacks with dice roll " + attackDiceRoll + " for " + attackDamage + " damage.");
            System.out.println(defender + " defends with dice roll " + defenseDiceRoll + " for " + defendStrength + " defense.");
            System.out.println(defender + " takes " + damageTaken + " damage. " + defender + " health: " + defender.getHealth());

            // Swap roles for next turn
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        // Game over message
        System.out.println("Game over.");
        if (!playerA.isAlive()) {
            System.out.println(playerB + " wins!");
        } else {
            System.out.println(playerA + " wins!");
        }
    }

    public static void main(String[] args) {
        Player playerA = new Player("A", 50, 5, 10); // Create player A with name, health, strength, and attack
        Player playerB = new Player("B", 100, 10, 5); // Create player B with name, health, strength, and attack

        Main game = new Main(playerA, playerB); // Create a game instance with player A and player B
        game.run(); // Start the game simulation
        System.out.println();
        System.out.println("Player unit test");        
        //player unit test
        PlayerUnitTest.unittest();
        System.out.println("Main unit test");  
    }
}

