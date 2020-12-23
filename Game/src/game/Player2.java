package game;

public class Player2 extends Player1 {
	public Player2() {
		super("AIplayer", randomChoice());
	}

	public static String randomChoice() {
		int random = (int) (Math.random() * 3);

		String playerChoice;
		switch (random) {
		case 0:
			playerChoice = "Rock";
			break;
		case 1:
			playerChoice = "Paper";
			break;
		default:
			playerChoice = "Scissors";
			break;

		}
		return playerChoice;
	}
}
