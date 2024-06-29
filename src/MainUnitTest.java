public class MainUnitTest {

    public static void unittest() {
        testGameExecution();
    }

    public static void testGameExecution() {
        Player playerA = new Player("A", 50, 5, 10);
        Player playerB = new Player("B", 100, 10, 5);

        Main game = new Main(playerA, playerB);
        game.run();

        // Check the game outcome
        if (!playerA.isAlive() && playerB.isAlive()) {
            System.out.println(playerB + " wins!");
        } else if (playerA.isAlive() && !playerB.isAlive()) {
            System.out.println(playerA + " wins!");
        } else {
            System.out.println("Game did not end correctly.");
        }
    }
}
