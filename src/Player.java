public class Player {
    private int health;
    private int strength;
    private int attack;
    private String name;

    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public String toString() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void receiveDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public int attack(int diceRoll) {
        return attack * diceRoll;
    }

    public int defend(int diceRoll) {
        return strength * diceRoll;
    }
}