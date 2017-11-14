// **********************************************************
// Player.java
//
// Defines a Player class that holds information about an athlete.
// **********************************************************

public class Player {
	private String name;
	private String team;
	private int jerseyNumber;

	// -----------------------------------------------------------
	// Prompts for and reads in the player's name, team, and
	// jersey number.
	// -----------------------------------------------------------

	public void setName(String name) {
		this.name = name;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setNumber(int number) {
		this.jerseyNumber = number;
	}

	public boolean equals(Object o) {
		Player ply = (Player) o;
		if (ply.team.equals(team) && ply.jerseyNumber == jerseyNumber) {
			return true;
		} else {
			return false;
		}
	}

}