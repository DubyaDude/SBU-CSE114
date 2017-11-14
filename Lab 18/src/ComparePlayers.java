
// **********************************************************
// ComparePlayers
//
// Reads in two Player objects and tells whether they represent
// the same player.
// **********************************************************

import java.util.*;

public class ComparePlayers {
	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player();
		Scanner scn = new Scanner(System.in);

		// Prompt for and read in information for player 1
		System.out.println("Enter information for player 1");

		System.out.println("Enter Name");
		String name1 = scn.next();
		System.out.println("Enter Team");
		String team1 = scn.next();
		System.out.println("Enter Number");
		int jerseyNumber1 = scn.nextInt();
		// Prompt for and read in information for player 2
		System.out.println("Enter information for player 2");

		System.out.println("Enter Name");
		String name2 = scn.next();
		System.out.println("Enter Team");
		String team2 = scn.next();
		System.out.println("Enter number");
		int jerseyNumber2 = scn.nextInt();

		player1.setName(name1);
		player1.setTeam(team1);
		player1.setNumber(jerseyNumber1);

		player2.setName(name2);
		player2.setTeam(team2);
		player2.setNumber(jerseyNumber2);

		if (player1.equals(player2)) {
			System.out.println("The two players are equal");
		} else {
			System.out.println("Theyre not equal");
		}

	}
}