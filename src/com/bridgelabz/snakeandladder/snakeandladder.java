package com.bridgelabz.snakeandladder;

public class snakeandladder {

	public static final int NOPLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	public static void main(String[] args) {
		System.out.println("Welcome");
		System.out.println("The Player Starts at Position 0");
		int numberOnDie=0,currentPosition=0;
		while(currentPosition<100)
		{
			numberOnDie=(int)((Math.random()*100)%6)+1;
			System.out.println("The Number on the Die is: "+numberOnDie);
			int choice=(int)(Math.random()*100)%3;
			switch(choice) {
				case NOPLAY:
					System.out.println("The Option is No Play");
					break;
				case LADDER:
					System.out.println("The Option is Ladder");
					currentPosition=currentPosition+numberOnDie;
					break;
				case SNAKE:
					System.out.println("The Option is Snake");
					currentPosition=currentPosition-numberOnDie;
					break;
		
			}
			if(currentPosition<0) {
				currentPosition=0;
			}	
			System.out.println("The Current Position "+currentPosition);
		}
		System.out.println("The Player reached Winning position");
		
		

		}
		
		
}
