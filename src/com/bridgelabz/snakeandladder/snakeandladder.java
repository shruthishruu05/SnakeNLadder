package com.bridgelabz.snakeandladder;

public class snakeandladder {

	
	public static final int NOPLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	public static void main(String[] args) {
		System.out.println("Welcome ");
		System.out.println("The Player Starts at Position 0");
		int numberOnDie=0,currentPosition1=0,currentPosition2=0;
		boolean player1_Turn=true,player2_Turn=false,player_1=false,player_2=false;
		
		while(currentPosition1<100 && currentPosition2<100)
		{
			if(player1_Turn)
			{
				System.out.println("Player 1's Turn.");
				player1_Turn=false;
				numberOnDie=(int)((Math.random()*100)%6)+1;
				
				System.out.println("The Number on the Die is "+numberOnDie);
				int choice=(int)(Math.random()*100)%3;
				switch(choice) {
					case NOPLAY:
						System.out.println("Option is No Play");
						player2_Turn=true;
						break;
					case LADDER:
						System.out.println("Option is Ladder");
						currentPosition1=currentPosition1+numberOnDie;
						player1_Turn=true;
						break;
					case SNAKE:
						System.out.println("Option is Snake");
						currentPosition1=currentPosition1-numberOnDie;
						player2_Turn=true;
						break;
		
				}
				if(currentPosition1<0) {
					currentPosition1=0;
				}	
				if(currentPosition1>100) {
					currentPosition1=currentPosition1-numberOnDie;
				}
				if(currentPosition1==100)
				{
					player_1=true;
					break;
				}
				System.out.println("Current Position of Player 1: "+currentPosition1);
				}
				if(player2_Turn)
				{
					System.out.println("Player 2 Turn");
					player2_Turn=false;
					numberOnDie=(int)((Math.random()*100)%6)+1;
					//count=count+1;
					System.out.println("The Number on the Die is "+numberOnDie);
					int option=(int)(Math.random()*100)%3;
					switch(option) {
					case NOPLAY:
						System.out.println("Option is No Play");
						player1_Turn=true;
						break;
					case LADDER:
						System.out.println("Option is Ladder");
						currentPosition2=currentPosition2+numberOnDie;
						player2_Turn=true;
						break;
					case SNAKE:
						System.out.println("Option is Snake");
						currentPosition2=currentPosition2-numberOnDie;
						player1_Turn=true;
						break;
		
					}
					if(currentPosition2<0) {
						currentPosition2=0;
					}	
					if(currentPosition2>100) {
						currentPosition2=currentPosition2-numberOnDie;
					}
					if(currentPosition2==100)
					{
						player_2=true;
						break;
					}
					System.out.println("Current Position of Player 2 is: "+currentPosition2);
			}
		}
		if(player_1)
		System.out.println("The Player 1 has won the game");
		else if(player_2)
			System.out.println("The Player 2 has won the game");
		
		}
		
		
}