import java.util.ArrayList;

public class Player {

    String name;
    ArrayList<String> sports;

    /**
     * Constructor for objects of class Player
     * 
     * @param name
     */
    public Player(String name) {
        this.name = name;
        sports = new ArrayList<>();
    }

    /**
     * Add a sport to the player's list of sports
     * 
     * @param sport
     */
    public void addSport(String sport) {
        sports.add(sport);
    }

    /**
     * Get the name of the player
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the list of sports the player plays
     * 
     * @return sports
     */
    public ArrayList<String> getSports() {
        return sports;
    }

    /**
     * Get the number of sports the player plays
     * 
     * @return number of sports
     */
    @Override
    public String toString() {
        return "\n" + name + ": " + sports.toString();
    }
}
