import java.util.*;

public class Userplayer {
	
	public String Username;
	int choice = 0;
	

	Scanner keyboard = new Scanner( System.in );
	
	time OneSec = new time();
	
	public void UserInput(){
	
		Username = keyboard.next();
	
	
	}
	
	public void PlayerIntro(){

		System.out.println("Please enter a username:");
		
		UserInput();
		
		System.out.println("Hello " + Username + " Nice of you to play. ");
		
		
	}
	
	

}
