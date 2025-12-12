import java.util.Scanner;

public class secondQuestion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		  
		  System.out.println("WELCOME TO UUM GOKART SYSTEM!\n");

        // Reading the player type and number of players
        System.out.println("Enter player type, 1-UUM student and 2-outsider:");
        int playerType = input.nextInt();

        System.out.println("Enter number of players:");
        int numOfPlayers = input.nextInt();
         
			
        // Calculate and display the total price based on player type and number of players
        double totalPrice = 0;
		  
        if (playerType == 1) {
            totalPrice = studentTicket(numOfPlayers);
        } 
		  else if (playerType == 2) {
            totalPrice = outsiderTicket(numOfPlayers);
        } 
		  else {
            System.out.println("Invalid player type.");
				return;
        }
       
        System.out.printf("Ticket price: RM %.2f\n", totalPrice);
		  System.out.printf("THANKS AND ENJOY YOUR GAME");
		  
    }//main

    // Method to calculate the price for student players
    public static double studentTicket(int numOfPlayers) {
        double pricePerPlayer = 0;
        
		  if (numOfPlayers >= 1 && numOfPlayers <= 5) {
            pricePerPlayer = 10.00;
        } else if (numOfPlayers >= 6 && numOfPlayers <= 10) {
            pricePerPlayer = 7.00;
        } else if (numOfPlayers > 10) {
            pricePerPlayer = 5.00;
        }
        return numOfPlayers * pricePerPlayer;
    }//student's method

    // Method to calculate the price for outsider players
    public static double outsiderTicket(int numOfPlayers) {
        double pricePerPlayer = 0;
        
		  if (numOfPlayers >= 1 && numOfPlayers <= 5) {
            pricePerPlayer = 40.00;
        } else if (numOfPlayers >= 6 && numOfPlayers <= 10) {
            pricePerPlayer = 35.00;
        } else if (numOfPlayers > 10) {
            pricePerPlayer = 30.00;
        }
        return numOfPlayers * pricePerPlayer;
    }//outsider's method

}//class
