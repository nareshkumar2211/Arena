public class PlayerUnitTest {

    public static void unittest() {
        testPlayerInitialization();
        testReceiveDamage();
        testAttack();
        testDefend();
    }

    public static void testPlayerInitialization() {
        Player player = new Player("TestPlayer", 100, 20, 15);
        
        if (!player.toString().equals("TestPlayer")) {
            System.out.println("Failed-Player toString() test.");
        }
        else{
            System.out.println("Passed-Player toString() test.");
        }

        if (player.getHealth() != 100 || !player.isAlive()) {
            System.out.println("Failed-Player initialization test.");
        }
        else{
            System.out.println("Passed-Player initialization test.");
        }
    }

    public static void testReceiveDamage() {
        Player player = new Player("TestPlayer", 100, 20, 15);
        
        player.receiveDamage(30);
        if (player.getHealth() != 70) {
            System.out.println("Failed-Player receiveDamage() test.");
        }
        else{
            System.out.println("Passed-Player receiveDamage() test.");
        }
        
        player.receiveDamage(80);
        if (player.getHealth() != 0 || player.isAlive()) {
            System.out.println("Failed-Player receiveDamage() negative health test.");
        }
        else{
            System.out.println("Passed-Player receiveDamage() negative health test.");
        }
    }

    public static void testAttack() {
        Player player = new Player("TestPlayer", 100, 20, 15);
        
        int damage = player.attack(4); // Assuming dice roll of 4
        if (damage != 60) {
            System.out.println("Failed-Player attack() test.");
        }
        else{            
            System.out.println("Passed-Player attack() test.");
        }
    }

    public static void testDefend() {
        Player player = new Player("TestPlayer", 100, 20, 15);
        
        int defense = player.defend(3); // Assuming dice roll of 3
        if (defense != 60) {
            System.out.println("Failed-Player defend() test.");
        }
        else
        {   System.out.println("Passed-Player defend() test.");
        }
    }
}
