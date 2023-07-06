public class GuessingGame {
    public static void main(String[] args) {
        int secretNumber = 0;
        int guess = -1;

        if (secretNumber == guess) {
            System.out.println("Well Done, You are CORRECT!!");
        } else if (secretNumber < guess) {
            System.out.println("Your Guess is Too HIGH");
        } else {
            System.out.println("Your Guess Is Too LOW");
        }

    }
}
