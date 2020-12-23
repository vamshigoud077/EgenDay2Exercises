package game;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Player1 {
	private String playerName;
	private String playerChoice;
	private int winningCount;
	
public static Set<String> rightChoice= new HashSet<>(Arrays.asList("Rock","Paper","Scissors"));
 public Player1(String playerName, String playerChoice) {
	 this.playerName= playerName;
	 this.playerChoice= playerChoice;
	 this.winningCount= 0;
	 
 }
 
 public Player1() {
	 this.winningCount=0;
	 
 }

public String getPlayerName() {
	return playerName;
}

public void setPlayerName(String playerName) {
	this.playerName = playerName;
}

public String getPlayerChoice() {
	return playerChoice;
}

public void setPlayerChoice(String playerChoice) {
	this.playerChoice = playerChoice;
}

public int getWinningCount() {
	return winningCount;
}

public void setWinningCount(int winningCount) {
	this.winningCount = winningCount;
}
 public void counterIncrement() {
	 this.winningCount++;
 }

}
