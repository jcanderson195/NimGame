import java.util.Scanner;
public class TwoPlayers {

	Scanner keyboard = new Scanner(System.in);
	time oneSecDelay = new time();
	
		int choice = 0;	
		int CounterTotal = 17;	
		int newCounterTotal = 16;
		int user1Cheat = 1;
		int piece1 = 1;
		int piece2 = 2;
		int piece3 = 3;		
		int CheatFirstTurn = CounterTotal + user1Cheat - piece1;
		
		
		public String Username2;
		
		public void UserInput2(){
			
			this.Username2 = keyboard.next();

		}
		
		public void PlayerTwo(){

			System.out.println("Please enter a username player 2:");
			
			UserInput2();
			
			System.out.println("Hello " + Username2 + " Nice of you to play as well! ");
		}
		
		
		public void TwoPlayerClassic(Userplayer user){
			
/*player1*/		while (newCounterTotal  <= 16){
				System.out.println(user.Username + "'s turn to pull.");
				
				
					System.out.println("1. Pull one piece");
					System.out.println("2. Pull two pieces");
					System.out.println("3. Pull three pieces");
					
					choice = keyboard.nextInt();
					
					if (choice == 1 && CounterTotal <=3){
						System.out.println(user.Username + " pulled one piece");
						System.out.println("Counter total: " + (CounterTotal -= 1));
					}
					else if (choice == 2 && CounterTotal ==3){
						System.out.println(user.Username + " pulled two pieces");
						System.out.println("Counter total: " + (CounterTotal -= 2));
						System.out.println(user.Username +" you lost the game." +Username2+ "You won the game!");
						break;
						
						
					}
					else if (choice == 3 && CounterTotal ==3){
						System.out.println(user.Username + " pulled three pieces");
						System.out.println("Counter total: " + (CounterTotal -= 3 ));
						System.out.println(user.Username +" you lost the game." +Username2+ "You won the game!");
						break;

			}
				
					else if (choice == 1 && CounterTotal ==2){
						System.out.println(user.Username + " pulled one piece");
						System.out.println("Counter total: " + (CounterTotal -= 1));
						System.out.println(Username2 +" you lost the game." +user.Username+ "You won the game!");
						
						
					}
					else if (choice == 2 && CounterTotal ==2){
						System.out.println(user.Username + " pulled two pieces");
						System.out.println("Counter total: " + (CounterTotal -= 2));
						System.out.println(user.Username +" you lost the game." +Username2+ "You won the game!");
						break;

						
					}
					
				
/*Normal p1*/		else if (choice == 1){
					System.out.println(user.Username + " pulled one piece");
					System.out.println("Counter total: " + (CounterTotal -= 1));
					
				}
				else if (choice == 2){
					System.out.println(user.Username + " pulled two pieces");
					System.out.println("Counter total: " + (CounterTotal -= 2));
					
				
				}
				else if (choice == 3){
					System.out.println(user.Username + " pulled three pieces");
					System.out.println("Counter total: " + (CounterTotal -= 3 ));
							
				}


				
/*player2*/			System.out.println(Username2 + "'s turn to pull.");
					
					
					System.out.println("1. Pull one piece");
					System.out.println("2. Pull two pieces");
					System.out.println("3. Pull three pieces");
					
					choice = keyboard.nextInt();
					
					
					if (choice == 1 && CounterTotal <=3){
						System.out.println(Username2 + " pulled one piece");
						System.out.println("Counter total: " + (CounterTotal -= 1));
						
						
					}
					else if (choice == 2 && CounterTotal == 3){
						System.out.println(Username2 + " pulled two pieces");
						System.out.println("Counter total: " + (CounterTotal -= 2));
						System.out.println(user.Username + " you lost the game." +Username2+ " you won the game!");
						break;
						
					}
					else if (choice == 3 && CounterTotal == 3){
						System.out.println(Username2 + " pulled three pieces");
						System.out.println("Counter total: " + (CounterTotal -= 3 ));
						System.out.println(Username2 + " you lost the game." +user.Username+ " you won the game!");
						break;
			}
					
					else if (choice == 1 && CounterTotal == 2){
						System.out.println(Username2 + " pulled one piece");
						System.out.println("Counter total: " + (CounterTotal -= 1));
						System.out.println(user.Username +" you lost the game." +Username2+ "You won the game!");
						break;	
							
						}
						else if (choice == 2 && CounterTotal == 2){
							System.out.println(Username2 + " pulled two pieces");
							System.out.println("Counter total: " + (CounterTotal -= 2));
							System.out.println(Username2 +" you lost the game." +user.Username+ "You won the game!");
							break;
							
						}
						
/*normal p2*/			else if (choice == 1){
						System.out.println(Username2 + " pulled one piece");
						System.out.println("Counter total: " + (CounterTotal -= 1));
						
					}
					else if (choice == 2){
						System.out.println(Username2 + " pulled two pieces");
						System.out.println("Counter total: " + (CounterTotal -= 2));
					
					}
					else if (choice == 3){
						System.out.println(Username2 + " pulled three pieces");
						System.out.println("Counter total: " + (CounterTotal -= 3 ));
						
						
							
					}
					
					}
				
				}	 
					
			
				
			
			
			
			
		
		
		
		public void TwoPlayerHotSeat(){
			
			
			
		}
	
}
