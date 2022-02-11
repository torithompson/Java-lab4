import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {

    static ArrayList<Player> playerList = new ArrayList<>();

    /**
     * Players and sports application
     * <br>
     * This application reads information consisting of player names and the sports they play 
     * from an input file.   
     * Each line of the input file must consist of a player name followed by a comma-separated 
     * list of sports.  A new player object is created from the data contained in each line of the file.
     * Each new player object is added to an ArrayList of Player objects
     * <br>
     * 
     * @param args - args[0] will hold name of input file (to be done in lab)
     */
    public static void main(String[] args)  {
        loadPlayerFile();
        System.out.println(playerList);
    }
    

    /**
     * 
     * 
     * loadPlayerFile
     * 
     * 1 - Open input and output files
     * 2 - For each line of input
     * 3 -- split line into tokans
     * 4 -- create new player whose name is given by token[0]
     * 5 -- add remaining tokens to player's list of sports 
     * 6 - add player to player list
     * 
     */

    private static void loadPlayerFile() {
        File file = new File("res/players.txt");
        try{
            // 1            
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // 2
            String line = bufferedReader.readLine();
            while (line != null)
            {
                String[] tokens = line.split(",");              // 3
                Player player = new Player(tokens[0].trim());   // 4
                for (int i = 1; i < tokens.length; i++) {       // 5
                    String sport = tokens[i].trim();
                    player.addSport(sport);
                }                
                playerList.add(player);                         // 6

                line = bufferedReader.readLine();               
            }
            bufferedReader.close();
        }
        catch(NullPointerException e)
        {
            System.err.println("loadPlayerFile");
            System.err.println(e.getMessage());
        }
        catch (FileNotFoundException e)
        {
            System.err.println("Check the input file name");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            System.out.println("Problem reading data from input file");
            e.printStackTrace();
        }
    }
}
