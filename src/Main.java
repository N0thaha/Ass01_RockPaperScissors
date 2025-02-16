import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playAgain = "Y";

        while (playAgain.equals("Y")) {
            String playerA = "";
            String playerB = "";

            while (!(playerA.equals("R") || playerA.equals("P") || playerA.equals("S"))){
                System.out.print("Player A, enter your move (R, P, S): ");
                playerA = in.nextLine().toUpperCase();
            }

            while (!(playerB.equals("R") || playerB.equals("P") || playerB.equals("S"))) {
                System.out.print("Player B, enter your move (R, P, S): ");
                playerB = in.nextLine().toUpperCase();
            }

            String result = "";
            if (playerA.equals(playerB)) {
                result = playerA + " vs " + playerB + " - It's a Tie!";
            } else if ((playerA.equals("R") && playerB.equals("S")) ||
                    (playerA.equals("P") && playerB.equals("R")) ||
                    (playerA.equals("S") && playerB.equals("P"))) {
                if (playerA.equals("R") && playerB.equals("S")) result = "Rock breaks Scissors - Player A wins!";
                if (playerA.equals("P") && playerB.equals("R")) result = "Paper covers Rock - Player A wins!";
                if (playerA.equals("S") && playerB.equals("P")) result = "Scissors cuts Paper - Player A wins!";
            } else {
                if (playerB.equals("R") && playerA.equals("S")) result = "Rock breaks Scissors - Player B wins!";
                if (playerB.equals("P") && playerA.equals("R")) result = "Paper covers Rock - Player B wins!";
                if (playerB.equals("S") && playerA.equals("P")) result = "Scissors cuts Paper - Player B wins!";
            }

            System.out.println(result);

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = in.nextLine().toUpperCase();
        }

        System.out.println("Thanks for playing!");
        in.close();
    }
}
