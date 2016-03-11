import java.util.Scanner;
public class SinglePlayer {

	
	Scanner keyboard = new Scanner(System.in);
	time oneSecDelay = new time();
	
		int choice = 0;	
		int counterTotal = 17;	
		int newCounterTotal = 16;
		int computerCheat = 1;
		int piece1 = 1;
		int piece2 = 2;
		int piece3 = 3;
		public int piece1Pull = newCounterTotal - piece1;
		public int piece2Pull = newCounterTotal - piece2;
		public int piece3Pull = newCounterTotal - piece3;
		
		int computerFirstTurn = counterTotal + computerCheat - piece1;
		
		
	
	public void SinglePlayerImpossible(Userplayer user){
		
		System.out.println("Computer goes first!");
		oneSecDelay.OneSecond();
		
			System.out.println("Computer pulled " + piece1 + " piece from the counter pile");
			System.out.println("Counter total: " + (computerFirstTurn - 1));
			
		while (newCounterTotal <= 16){
		System.out.println(user.Username + "'s turn to pull.");
		
		
		System.out.println("1. Pull one piece");
		System.out.println("2. Pull two pieces");
		System.out.println("3. Pull three pieces");
		
		choice = keyboard.nextInt();
		
		if (choice == 1){
			System.out.println(user.Username + " pulled one piece");
			System.out.println("Counter total: " + (newCounterTotal -= 1));
			
			System.out.println("Computer's turn....");
				System.out.println("Computer pulled "+piece3+ " pieces from the pile");
				System.out.println("Counter total: " + (newCounterTotal -= 3 ));
		}
		else if (choice == 2){
			System.out.println(user.Username + " pulled two pieces");
			System.out.println("Counter total: " + (newCounterTotal -= 2));
			
			System.out.println("Computer's turn....");
				System.out.println("Computer pulled "+piece2+ " pieces from the pile");
				System.out.println("Counter total: " + (newCounterTotal -= 2));
		}
		else if (choice == 3){
			System.out.println(user.Username + " pulled three pieces");
			System.out.println("Counter total: " + (newCounterTotal -= 3 ));
			
			System.out.println("Computer's turn....");
				System.out.println("Computer pulled "+piece1+ " piece from the pile");
				System.out.println("Counter total: " + (newCounterTotal -= 1));

			
		}
		
			

		 
			

		}
			
			

		}
		
		

		
		}		

	
	
	

