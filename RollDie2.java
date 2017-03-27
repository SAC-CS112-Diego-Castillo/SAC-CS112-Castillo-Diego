
import java.util.Scanner;
import java.util.Random;
public class RollDie2 {
	//private static int numberOfGames = 10000;
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
	  int lose = 0, computerRoll = 0;
	  int userWins = 0;
 int numberOfGames = 0, userRoll = 0;
	//for (int round = 0; round < numberOfGames; round++) {

    computerRoll = rollDie();
    userRoll= rollDie();
while (true) {
        System.out.println("Do you want to play Even or Odd (Y/N): ");
        String play = input.nextLine();

        // user terminates game and program prints number of wins, losses and percentage of wins.
        if (play.equals("N")) {

            System.out.println("You played a total of " + numberOfGames);

            System.out.println("You won " + userWins+ " matches");

            // 0% wins when no games are played.
            if (numberOfGames == 0) { 
                System.out.println("You won 0% of the time!");
                break;

            } else if (numberOfGames > 0) {
                double totalWins = (int)(userWins / numberOfGames) * 100;
                System.out.println("You won " + totalWins + "% of the time!");
                break;
            }

        } else if ((!play.equals("N")) && (!play.equals("Y"))) {
            System.out.println("Invalid entry");
        } else {

            System.out.println("Welcome to Even or Odd!");
            System.out.print("Select \"Even\", \"Odd\" : ");
            String decision = input.nextLine();
            System.out.println("Your selection: " + decision);
    // determine who won the game
            if(userRoll% 2==0){
        		decision.equals("Odd");
           // even
           //decision.equals("Odd");
           System.out.println("You lose!");
           System.out.println("Even " + userRoll);
          
                numberOfGames++;
        	}else if  (decision.equals("Even")){
        	
        		System.out.println("You Lose!");
        		   System.out.println("Odd " + userRoll);
        		   userWins++;
        		        numberOfGames++;
        	}
        		        else if(userRoll % 2!=0){
		decision.equals("Odd");
   // even
   //decision.equals("Odd");
   System.out.println("You win!");
   System.out.println("Odd " + userRoll);
   userWins++;
        numberOfGames++;
	}else {  decision.equals("Even");
	
		System.out.println("You win!");
		   System.out.println("Even " + userRoll);
		   
		        numberOfGames++;
	}            
        }
        }
}

  static int rollDie() {
    Random randValue = new Random();
    return randValue.nextInt(6) + 1;
 }
}