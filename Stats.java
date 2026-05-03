public class Stats {
	private int pace;
	private int shooting;
	private int passing;
	private int dribbling;
	private int defending;
	private int physical;

	public Stats() {
		// Stats start at 1
		this.pace = 1;
		this.shooting = 1;
		this.passing = 1;
		this.dribbling = 1;
		this.defending = 1;
		this.physical = 1;
	} // end stats constructor
	
	// getters and setters
	
	
	public int getPace(){
		return pace;
	}
	public void setPace(int pace) {
	       	this.pace = pace;
       	}

    public int getShooting(){
	    return shooting;
    }
    public void setShooting(int shooting){ 
	    this.shooting = shooting;
    }

    public int getPassing(){ 
	    return passing; 
    }
    public void setPassing(int passing){ 
	    this.passing = passing;
    }

    public int getDribbling(){
	    return dribbling;
    }
    public void setDribbling(int dribbling){
	    this.dribbling = dribbling; 
    }
    public int getDefending(){
	    return defending;
    }
    public void setDefending(int defending){
	    this.defending = defending; 
    }

    public int getPhysical(){
	    return physical;
    }
    public void setPhysical(int physical){
	    this.physical = physical;
    }

    public void displayStats() {
	    System.out.println("--- Attributes ---");
	    System.out.println("PAC: " +pace + " | SHO: " + shooting + " | PAS: " + passing);
	    System.out.println("DRI: " + dribbling + " | DEF: " + defending + " | PHY: " + physical);
	    System.out.println("---------------");
    } // end displayStats
} // end class Stats
