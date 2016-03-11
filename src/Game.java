import java.util.Scanner;
public class Game {
	
	time twoSecDelay = new time();

	Userplayer Intro = new Userplayer();
	Scanner keyboard = new Scanner( System.in );
	
	time OneSec = new time();
	boolean run = true;
	int choice = 0;
	
	public void getGame(){
	
		System.out.println("Welcome to the game of Nim!");
		
		twoSecDelay.TwoSeconds();
		
		System.out.println("Here are the rules: 1. Choose who goes first. 2. You can pull either 1,2,or 3 counters from the pile of counters. Each player takes turns pulling counters from the pile. 3. The player to pull the last counter from the pile loses the game.");
	
		Intro.PlayerIntro();
		
		StartMenu();
	
		
	}
	
public void StartMenu(){
		
		
		while (run){
			OneSec.OneSecond();
		System.out.println("Menu");
		System.out.println("----");
		OneSec.OneSecond();
		System.out.println("1. Single Player Impossible");
		System.out.println("2. Two Player Classic");
		System.out.println("3. Two Player Hot Seat");
		System.out.println("3. Exit");
		
		choice = keyboard.nextInt();
		
		if (choice ==1){
			SinglePlayer newSinglePlayer = new SinglePlayer();
			newSinglePlayer.SinglePlayerImpossible(Intro);
			
			break;
		}else if(choice ==2){
			
			break;
		}
		else if (choice ==3){
			
			break;
		}
			else if (choice == 4){
		
			System.out.println("Thank You For Playing The Game of Nim!");
			try {
				Thread.sleep(50000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			
		}else {
			System.out.println("Sorry we don't recognize that answer!");
			
		}
		}
	
	
}	
}
