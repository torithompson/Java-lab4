import java.util.ArrayList;

/*Sport class - holds sport name and an array of list of players */
public class Sport {

    String sportName;

    ArrayList<String> playerList;

    /**
     *
     * @param sportName - string representing name of the sport
     */
    public Sport(String sportName) {
        this.sportName = sportName;
        playerList = new ArrayList<>();
    }

    /**
     * 
     * @param name - name of the player to be added to the player list
     */
    public void addPlayer(String playerName) {
        playerList.add(playerName);
    }

    /**
     * This is an override for toString method
     */
    @Override
    public String toString() {
        return playerList.toString();
    }

}
