import java.util.Scanner;
public class SinglePlayer {

	
	Scanner keyboard = new Scanner(System.in);
	time oneSecDelay = new time();
	
		int choice = 0;	
		int CounterTotal = 17;	
		int newCounterTotal = 16;
		int computerCheat = 1;
		int piece1 = 1;
		int piece2 = 2;
		int piece3 = 3;		
		int computerFirstTurn = CounterTotal + computerCheat - piece1;
		
		
	
	public void SinglePlayerImpossible(Userplayer user){
		
		System.out.println("Computer goes first!");
		oneSecDelay.OneSecond();
		
			System.out.println("Computer pulled " + piece1 + " piece from the counter pile");
			System.out.println("Counter total: " + (computerFirstTurn));
			
		while (newCounterTotal  <= 16){
		System.out.println(user.Username + "'s turn to pull.");
		
		
		System.out.println("1. Pull one piece");
		System.out.println("2. Pull two pieces");
		System.out.println("3. Pull three pieces");
		
		choice = keyboard.nextInt();
		
		if (choice == 1 && CounterTotal <=5){
			System.out.println(user.Username + " pulled one piece");
			System.out.println("Counter total: " + (CounterTotal -= 1));
			
			
			System.out.println("Computer's turn....");
				System.out.println("Computer pulled "+piece2+ " pieces from the pile");
				System.out.println("Counter total: " + (CounterTotal -= 3 ));
				System.out.println(user.Username + " You lose the game! The computer wins!");
				break;
		}
		else if (choice == 2 && CounterTotal <=5){
			System.out.println(user.Username + " pulled two pieces");
			System.out.println("Counter total: " + (CounterTotal -= 2));
			
			System.out.println("Computer's turn....");
				System.out.println("Computer pulled "+piece1+ " pieces from the pile");
				System.out.println("Counter total: " + (CounterTotal -= 1));
				System.out.println(user.Username + " You lose the game! The computer wins!");
				break;
		}
		else if (choice == 3 && CounterTotal <=5){
			System.out.println(user.Username + " pulled three pieces");
			System.out.println("Counter total: " + (CounterTotal -= 3 ));
			
			System.out.println("Computer's turn....");
				System.out.println("Computer pulled "+piece1+ " piece from the pile");
				System.out.println("Counter total: " + (CounterTotal -= 1));
				System.out.println(user.Username + " You lose the game! The computer wins!");
				break;
		
}
		
		else if (choice == 1){
			System.out.println(user.Username + " pulled one piece");
			System.out.println("Counter total: " + (CounterTotal -= 1));
			
			System.out.println("Computer's turn....");
				System.out.println("Computer pulled "+piece3+ " pieces from the pile");
				System.out.println("Counter total: " + (CounterTotal -= 3 ));
		}
		else if (choice == 2){
			System.out.println(user.Username + " pulled two pieces");
			System.out.println("Counter total: " + (CounterTotal -= 2));
			
			System.out.println("Computer's turn....");
				System.out.println("Computer pulled "+piece2+ " pieces from the pile");
				System.out.println("Counter total: " + (CounterTotal -= 2));
		}
		else if (choice == 3){
			System.out.println(user.Username + " pulled three pieces");
			System.out.println("Counter total: " + (CounterTotal -= 3 ));
			
			System.out.println("Computer's turn....");
				System.out.println("Computer pulled "+piece1+ " piece from the pile");
				System.out.println("Counter total: " + (CounterTotal -= 1));
				
		}
		
		
			

		 
			

		}
			
			

		}
		
		
	}
		
				

	
	
	

