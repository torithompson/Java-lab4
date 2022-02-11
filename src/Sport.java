import java.util.ArrayList;

public class Sport {

    String sportName;

    ArrayList<String> playerList;

    public Sport(String sportName) {
        super();
        playerList = new ArrayList<>();
        this.sportName = sportName;
    }

    public void addPlayerName(String name)
    {
        playerList.add(name);
    }

    @Override
    public String toString() {
        return  playerList.toString() ;
    }
        
    
    

}
