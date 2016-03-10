import java.util.Scanner;
public class Game {
	
	time twoSecDelay = new time();

	Userplayer Intro = new Userplayer();
	Scanner keyboard = new Scanner( System.in );
	
	public void getGame(){
	
		System.out.println("Welcome to the game of Nim!");
		
		twoSecDelay.TwoSeconds();
		
		System.out.println("Here are the rules: 1. Choose who goes first. 2. You can pull either 1,2,or 3 counters from the pile of counters. Each player takes turns pulling counters from the pile. 3. The player to pull the last counter from the pile loses the game.");
	
		Intro.PlayerIntro();
	
	}
	
	
	
}
