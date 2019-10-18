import java.util.Scanner;

public class RockPaperScissors{

    public static void main (String [] args){
        int wins = 0;
        int ties = 0;
        int losses = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play rock, paper, scissors, human! Goodluck.");
        System.out.println("");

        String again = "y";

        while (again.equals("y")){
            int comp = (int) (Math.random()* 3) + 1;

            System.out.println("What do you throw? [1] Rock, [2] Paper, [3] Scissor?");
            int human = sc.nextInt();

            if (human == 1 ){
                if (comp == 2) {
                    System.out.println("You threw rock! I threw paper!");
                    System.out.println("I win! You are not a challenge for me ...");
                    losses ++;
                }
                else if (comp == 3) {
                    System.out.println("You threw rock! I threw scissor!");
                    System.out.println("Whaaa??... You beat me? RAGE!");
                    wins ++;
                }
                else{
                    System.out.println ("A draw ... pretty good, human! I demand a rematch ...");
                    ties ++;
                }
            }
            else if (human == 2 ){
                if (comp == 3) {
                    System.out.println("You threw paper! I threw scissor!");
                    System.out.println("I win! You are not a challenge for me ...");
                    losses ++;
                }
                else if (comp == 1) {
                    System.out.println("You threw paper! I threw rock!");
                    System.out.println("Whaaa??... You beat me? RAGE!");
                    wins ++;
                }
                else{
                    System.out.println ("A draw ... pretty good, human! I demand a rematch ...");
                    ties ++;
                }
            }
            else if (human == 3 ){
                if (comp == 1) {
                    System.out.println("You threw scissors! I threw rock!");
                    System.out.println("I win! You are not a challenge for me ...");
                    losses ++;
                }
                else if (comp == 2) {
                    System.out.println("You threw scissors! I threw paper!");
                    System.out.println("Whaaa??... You beat me? RAGE!");
                    wins ++;
                }
                else{
                    System.out.println ("A draw ... pretty good, human! I demand a rematch ...");
                    ties ++;
                }
            }
            else {
                System.out.println ("Invalid response, silly human!");
            }

            System.out.println("");
            System.out.println ("Play again? [y,n]");
            again = sc.next();
            System.out.println("");

        }

        System.out.println ("Good Game! Thanks for playing.");
        System.out.println("");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Ties: " + ties);
    }
}
