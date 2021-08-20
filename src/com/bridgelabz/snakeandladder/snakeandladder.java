package com.bridgelabz.snakeandladder;

public class snakeandladder {

	public static void main(String args[]) {
		System.out.println("Welcome to Snake and Ladder");
		System.out.println("The Player Starts at Position 0");
		int numberOnDie=0,currentPosition=0;
		numberOnDie=(int)((Math.random()*100)%6)+1;
		System.out.println(" Number on the Die is "+numberOnDie);
	}
}
