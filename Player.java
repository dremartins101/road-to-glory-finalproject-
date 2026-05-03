import java.util.Random;
import java.util.HashMap;
import java.util.Scanner;

public class Player {
    private String name; 
    private String position;
    private String nationality;
    private String continent; 
    private int prestige;     
    private int age;
    private Stats stats;

    public Player(String name, String position) {
        this.name = name;
        this.position = position;
        this.age = 17;
        this.stats = new Stats();
        applyNationality();
    } // end constructor
    
    private void applyNationality() { 
        String[] countries = {
            "Brazil", "Spain", "USA", "Nigeria", "Japan", "Netherlands", "Argentina", 
            "South Korea", "France", "England", "Scotland", "Ireland", "Colombia", 
            "Mexico", "Italy", "Germany", "Portugal", "Uruguay", "Morocco", "Senegal", 
            "Croatia", "Switzerland", "Norway", "Canada", "Chile", "Ghana", "Australia", 
            "Jamaica", "Egypt", "Sweden"
        };
        
        HashMap<String, CountryData> worldMap = new HashMap<>();

        // tier 1 - elite
        worldMap.put("Brazil", new CountryData("South America", 1));
        worldMap.put("Argentina", new CountryData("South America", 1));
        worldMap.put("Uruguay", new CountryData("South America", 1));
        worldMap.put("France", new CountryData("Europe", 1));
        worldMap.put("Germany", new CountryData("Europe", 1));
        worldMap.put("England", new CountryData("Europe", 1));
        worldMap.put("Italy", new CountryData("Europe", 1));
        worldMap.put("Spain", new CountryData("Europe", 1));
        worldMap.put("Netherlands", new CountryData("Europe", 1));
        worldMap.put("Portugal", new CountryData("Europe", 1));

        // tier 2 - challengers
        worldMap.put("Colombia", new CountryData("South America", 2));
        worldMap.put("Chile", new CountryData("South America", 2));
        worldMap.put("Mexico", new CountryData("North America", 2));
        worldMap.put("Nigeria", new CountryData("Africa", 2));
        worldMap.put("Morocco", new CountryData("Africa", 2));
        worldMap.put("Senegal", new CountryData("Africa", 2));
        worldMap.put("South Korea", new CountryData("Asia", 2));
        worldMap.put("Japan", new CountryData("Asia", 2));
        worldMap.put("Croatia", new CountryData("Europe", 2));
        worldMap.put("Switzerland", new CountryData("Europe", 2));

        // tier 3 - underdogs
        worldMap.put("USA", new CountryData("North America", 3));
        worldMap.put("Canada", new CountryData("North America", 3));
        worldMap.put("Jamaica", new CountryData("North America", 3));
        worldMap.put("Scotland", new CountryData("Europe", 3));
        worldMap.put("Ireland", new CountryData("Europe", 3));
        worldMap.put("Sweden", new CountryData("Europe", 3));
        worldMap.put("Ghana", new CountryData("Africa", 3));
        worldMap.put("Egypt", new CountryData("Africa", 3));
        worldMap.put("Australia", new CountryData("Asia", 3));
        worldMap.put("Norway", new CountryData("Europe", 3));

        Random rand = new Random();
        this.nationality = countries[rand.nextInt(countries.length)];
        
        CountryData data = worldMap.get(this.nationality);
        this.continent = data.continent;
        this.prestige = data.prestige;

        
        System.out.println("Nationality: " + this.nationality + " (" + this.continent + ") | Tier: " + this.prestige);

        switch (this.continent) {
            case "South America":
                stats.setDribbling(stats.getDribbling() + 2);
                System.out.println("South American Flair: +2 Dribbling");
                break;
            case "Europe":
                stats.setPassing(stats.getPassing() + 2);
                System.out.println("European Vision: +2 Passing");
                break;
            case "North America":
                stats.setPhysical(stats.getPhysical() + 2);
                System.out.println("North American Training: +2 Physical");
                break;
            case "Africa":
                stats.setPace(stats.getPace() + 2);
                System.out.println("African Pace: +2 Speed");
                break;
            case "Asia":
                stats.setDribbling(stats.getDribbling() + 2);
                System.out.println("Asian Technique: +2 Dribbling");
                break;
        } // end switch
    } // end applyNationality

    public void allocatePoints() {
        Scanner input = new Scanner(System.in);
        int pointsLeft = 3;

        System.out.println("\n--- Starting Attribute Points ---");
        
        while (pointsLeft > 0) {
            stats.displayStats();
            System.out.println("Points left: " + pointsLeft);
            System.out.print("Add point to (PAC, SHO, PAS, DRI, DEF, PHY): ");
            String choice = input.nextLine().toLowerCase();

            if (choice.equals("pac")) { stats.setPace(stats.getPace() + 1); pointsLeft--; }
            else if (choice.equals("sho")) { stats.setShooting(stats.getShooting() + 1); pointsLeft--; }
            else if (choice.equals("pas")) { stats.setPassing(stats.getPassing() + 1); pointsLeft--; }
            else if (choice.equals("dri")) { stats.setDribbling(stats.getDribbling() + 1); pointsLeft--; }
            else if (choice.equals("def")) { stats.setDefending(stats.getDefending() + 1); pointsLeft--; }
            else if (choice.equals("phy")) { stats.setPhysical(stats.getPhysical() + 1); pointsLeft--; }
            else { System.out.println("Invalid attribute choice."); }
        } // end while

        System.out.println("All points allocated successfully.");
    } // end allocatePoints
} // end class Player
