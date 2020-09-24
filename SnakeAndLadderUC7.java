/**Snake and ladder problem for 2 players UC7
 * 
 */

/**
 * @author Rachit
 *
 */
public class SnakeAndLadderUC7 {

	public static void main(String[] args) {
		int minPosition = 0;
		int maxPosition = 100;
		int noPlay=0;
		int ladder=1;
		int snake =2;
		//variables
		int playerOnePosition = 0;
		int playerTwoPosition = 0;
		int dice = 0;
		int diceCountPlayerOne=0;
		int diceCountPlayerTwo=0;
		int check=0;
		//computation
		
		while((playerOnePosition!=100)&&(playerTwoPosition!=100)) {
			//Game ends if any of the players reaches position 100
			do {
				dice = (int) Math.floor(Math.random()*10)%6;
				dice = dice+1;
				check = (int) Math.floor(Math.random()*10)%3;
				//To check whether player gets snake, ladder or noplay
				if(check==ladder) {
					playerOnePosition = playerOnePosition+dice;
				}
				else if(check==snake) {
					playerOnePosition = playerOnePosition-dice;
				}
				// Changing the player position according to dice value
				
				if(playerOnePosition>maxPosition) {
					playerOnePosition = playerOnePosition-dice;
				}
				//To prevent player from crossing max value. He is brought back to his older position
				if(playerOnePosition<minPosition) {
					playerOnePosition = minPosition;
				}
				//To prevent player from crossing min value
				
				System.out.println("Player 1 Position: "+playerOnePosition);
				//Printing player position everytime the dice is rolled
				
				diceCountPlayerOne++;
				}while(check==ladder);
			//do while loop to ensure player one gets to roll dice again if he gets a ladder
			
			do {
				dice = (int) Math.floor(Math.random()*10)%6;
				dice = dice+1;
				check = (int) Math.floor(Math.random()*10)%3;
				//To check whether player gets snake, ladder or noplay
				
				if(check==ladder) {
					playerTwoPosition = playerTwoPosition+dice;
				}
				else if(check==snake) {
					playerTwoPosition = playerTwoPosition-dice;
				}
				// Changing the player position according to dice value
				if(playerTwoPosition>maxPosition) {
					playerTwoPosition = playerTwoPosition-dice;
				}
				//To prevent player from crossing max value. He is brought back to his older position
				if(playerTwoPosition<minPosition) {
					playerTwoPosition = minPosition;
				}
				//To prevent player from crossing min value
				System.out.println("Player 2 Position: "+playerTwoPosition);
				//Printing player position everytime the dice is rolled
				
				diceCountPlayerTwo++;
				}while(check==ladder);
		//do while loop to ensure player two gets to roll dice again if he gets a ladder
		
		}

		if(playerOnePosition==maxPosition) {
			System.out.println("Player one wins");
		}
		else
			System.out.println("Player two wins");
		//Checking which player has reached the max position to decide the winner
		System.out.println("Dice rolls by player one: "+diceCountPlayerOne);
		System.out.println("Dice rolls by player two: "+diceCountPlayerTwo);
		

	}
}
