package zoolGame;

import java.util.Scanner;

public class Grid {

	// keep playing the game?

	/*String continueGaming = continuePlaying(s);

	Scanner s = new Scanner(System.in);
	String answer = s.nextLine();

	public String continuePlaying(Scanner s) {
		if (s.equals("yes")) {
			return "yes";
		} else {
			return "no";
		}

	}*/
	
	//Scanner s = new Scanner(System.in);
	//String answer = s.nextLine();
	/*
	int[][] tableTop = new int [10][10];
	
	int Xi = (int)(Math.random() * 10);
	
	int Yi = (int)(Math.random() * 10);
	
	tableTop[Xi][Yi] = 1;
	
	for(int i = 0; i < tableTop.length; i++) {
		
		for(int j = 0; j < tableTop.length; j++) {
			System.out.print("[" + tableTop[Xi][Yi] + "]");
		}*/

	// create infinite size variables
	
	boolean createTile = true;
	
	public int gridSize() {
		while(createTile){
			int size = size++;
			return size;
		}
	}

	int[][] swampLand = new int[gridSize()][gridSize()];
	
	
	
	int xCord = gridSize() - 1;
	int yCord = gridSize() - 1;
	
	
	
		
	

}
