package game;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to tha Game !!!!");
		System.out.println("Enter Player Name:");
		String playerName = input.nextLine();

		Player1 player1 = new Player1();
		Player2 player2 = new Player2();

		player1.setPlayerName(playerName);

		while (true) {
			System.out.println("Enter Rock,Paper or Scissors and to quit enter quit :");
			String moveMadeByPlayer = input.nextLine();

			if (moveMadeByPlayer.equals("quit")) {
				break;

			}
			player1.setPlayerChoice(moveMadeByPlayer);
			player2.setPlayerChoice(Player2.randomChoice());

			if (!Player1.rightChoice.contains(moveMadeByPlayer)) {
				System.out.println("Move Invalid");

			} else {
				System.out.println("player2 move :" + player2.randomChoice());
				String player2Move = player2.getPlayerChoice();

				if (moveMadeByPlayer.equals(player2Move)) {
					System.out.println("It is a tie");

				} else if (moveMadeByPlayer.equals("Rock") && player2Move.equals("Scissors")) {
					System.out.println(player1.getPlayerName() + "won");
					player1.counterIncrement();

				} else if (moveMadeByPlayer.equals("Scissors") && player2Move.equals("Paper")) {
					System.out.println(player1.getPlayerName() + "won");
					player1.counterIncrement();
				} else if (moveMadeByPlayer.equals("Paper") && player2Move.equals("Rock")) {
					System.out.println(player1.getPlayerName() + "won");
					player1.counterIncrement();
				} else {
					System.out.println(player2.getPlayerName() + "won");
					player2.counterIncrement();
				}
			}
			System.out.println("Game completed!!");
			System.out.println("Player1 won" + player1.getWinningCount() + "times" + "Player2 won"
					+ player2.getWinningCount() + "times");
		}
	}
}
