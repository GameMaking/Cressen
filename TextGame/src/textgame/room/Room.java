
package textgame.room;

import java.util.ArrayList;
import textgame.player.Player;

/**
 *
 * @author patrick
 */
public class Room {

    private ArrayList<Player> players;
    private String roomName;
    private int roomID;
    private int maxPlayers;

    public Room(ArrayList<Player> players, String roomName, int roomID, int maxPlayers) {
        this.players = players;
        this.roomName = roomName;
        this.roomID = roomID;
        this.maxPlayers = maxPlayers;
    }

    public boolean addPlayer(Player p) {
        if(players.size() < maxPlayers) {
            players.add(p);
            return true;
        }
        return false;
    }
    
    public boolean removePlayer(Player p) {
        return players.remove(p);
    }
    
    public int getCurrentPlayerCount() {
        return players.size();
    }
    
    
}
