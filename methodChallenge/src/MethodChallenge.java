public class MethodChallenge {

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }

    }

    public static void main(String[] args) {
        displayHighScorePosition("santhosh", calculateHighScorePosition(400));
        displayHighScorePosition("prevashnee", calculateHighScorePosition(1200));
    }
}
