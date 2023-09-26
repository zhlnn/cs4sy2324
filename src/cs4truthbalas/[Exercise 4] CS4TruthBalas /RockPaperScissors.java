import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
		
		int roundsToWin = 2;
		boolean inGame = true;

		while(inGame) {
			int playerScore = 0;
			int computerScore = 0;
			
			System.out.println("Welcome to Rock, Paper, Scissors! Please choose an option:" + "\n1. Start Game" + "\n2. Change number of rounds" + "\n3. Exit Application");

			int choice = input.nextInt();

			switch(choice) {
				case 1:
					boolean startGame = true;
					while(startGame) {
						int random = (int) Math.floor(Math.random()*3) + 1;
						Move computerMove = new Move("computerMove");

						switch(random) {
							case 1:
								computerMove = rock;
								break;
							case 2:
								computerMove = paper;
								break;
							case 3: computerMove = scissors;
								break;
						}

						System.out.println("\nThis match will be first to " + roundsToWin + " wins." + "\nThe computer has selected its move. Select your move: " + "\n1. Rock" + "\n2. Paper" + "\n3. Scissors");

						int move = input.nextInt();
						Move playerMove = new Move("playerMove");

						switch(move) {
							case 1:
								playerMove = rock;
								break;
							case 2:
								playerMove = paper;
								break;
							case 3:
								playerMove = scissors;
								break;
						}
            
						System.out.print("\nPlayer chose " + playerMove.getName() + ". Computer chose " + computerMove.getName() + ". ");

						switch(Move.compareMoves(playerMove, computerMove)) {
							case 0:
								System.out.println("Player wins round!");
								playerScore++;
								break;
							case 1:
								System.out.println("Computer wins round!");
								computerScore++;
								break;
							case 2:
								System.out.println("Round is tied.");
								break;
						}

						System.out.println("Player: " + playerScore + " - Computer: " + computerScore);

						if(playerScore >= roundsToWin) {
							System.out.println("\nPlayer wins!\n");
							startGame = false;
						}

						else if(computerScore >= roundsToWin) {
							System.out.println("\nComputer wins!\n");
							startGame = false;
						}
					}
					break;

				case 2:
					System.out.println("\nHow many wins are needed to win a match?");
					int rounds = input.nextInt();
					roundsToWin = rounds;
					System.out.println("\nNew setting has been saved!");
					break;
					
				case 3:
					System.out.println("\nThank you for playing!");
					inGame = false;
					break;
			}
		}
	}
}
