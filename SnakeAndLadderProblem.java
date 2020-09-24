/**Snake and ladder problem single player. UC 1 to 6
 * 
 */

/**
 * @author Rachit
 *
 */
public class SnakeAndLadderProblem {

	public static void main(String[] args) {
		final int minPosition = 0;
		final int maxPosition = 100;
		int noPlay=0;
		int ladder=1;
		int snake =2;
		//variables
		int playerPosition = 0;
		int dice = 0;
		int diceCount=0;
		//computation
		
		
		while(playerPosition!=maxPosition) {
			
		dice = (int) Math.floor(Math.random()*10)%6;
		dice = dice+1;
		//Adding 1 to dice position as we get values 0 to 5 so we convert it to 1 to 6
		int check = (int) Math.floor(Math.random()*10)%3;
		//To check whether player gets snake, ladder or noplay
		
		if(check==ladder) {
			playerPosition = playerPosition+dice;
		}
		else if(check==snake) {
			playerPosition = playerPosition-dice;
		}
		// Changing the player position according to dice value
		
		if(playerPosition>maxPosition) {
			playerPosition = playerPosition-dice;
		}
		//To prevent player from crossing max value. He is brought back to his older position
		if(playerPosition<minPosition) {
			playerPosition = minPosition;
		}
		//To prevent player from crossing min value
		System.out.println("Player Position: "+playerPosition);
		//Printing player position everytime the dice is rolled
		diceCount++;
		}
		System.out.println("Number of times the dice was rolled: "+diceCount);
		

	}

}
