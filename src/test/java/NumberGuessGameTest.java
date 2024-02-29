public class NumberGuessGameTest {
    public static void main(String[] args) {
        testGuessingGame();
    }

    public static void testGuessingGame() {
        // Test case: Guessing the correct number in one attempt
        testSingleGuess(50, 50);

        // Test case: Guessing the correct number in multiple attempts
        testMultipleGuesses(75);

        // Test case: Guessing the correct number as the first guess
        testSingleGuess(1, 1);

        // Test case: Guessing the correct number as the last guess
        testSingleGuess(100, 100);
    }

    public static void testSingleGuess(int secretNumber, int guessedNumber) {
        NumberGuessGame game = new NumberGuessGame();
        simulateGame(game, secretNumber, guessedNumber);
    }

    public static void testMultipleGuesses(int secretNumber) {
        NumberGuessGame game = new NumberGuessGame();
        int[] guesses = {30, 50, 75, secretNumber};
        for (int guess : guesses) {
            simulateGame(game, secretNumber, guess);
        }
    }

    public static void simulateGame(NumberGuessGame game, int secretNumber, int guessedNumber) {
        System.out.println("Secret Number: " + secretNumber);
        System.out.println("Guess: " + guessedNumber);
        game.simulateGuessing(guessedNumber, secretNumber);
        System.out.println();
    }
}
