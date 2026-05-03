public class Club {
	private String name;
	private String league;
	private int domPrestige;
	private int natPrestige;

	public Club(String name, String league, int prestigeTier){
		this.name = name;
		this.league = league;
		this.domPrestige = domPrestige;
		this.natPrestige = natPrestige;
	} // end club constructor
	

	public String getName() {
		return name;
	}

	public int getDomPrestige(){
		return domPrestige;
	}

	public getNatPrestige(){
		return natPrestige;
	} 
} // end class club
