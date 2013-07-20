package textgame.world;

import java.util.ArrayList;
import textgame.player.Player;
import textgame.room.Room;

/**
 *
 * @author patrick
 */
public class World {

    private ArrayList<Room> rooms;
    private String worldName;
    private int worldID;
    private int maxPlayers;
    private int playerCount;

    public World(ArrayList<Room> rooms, String worldName, int worldID, int maxPlayers) {
        this.rooms = rooms;
        this.worldName = worldName;
        this.worldID = worldID;
        this.maxPlayers = maxPlayers;
    }

    public void updatePlayerCount() {
        playerCount = 0;
        for (Room r : rooms) {
            playerCount += r.getCurrentPlayerCount();
        }
    }

    public boolean addPlayer(Player p, Room r) {
        if (rooms.contains(r)) {
            if (playerCount < maxPlayers) {
                if(rooms.get(rooms.indexOf(r)).addPlayer(p)) {
                    updatePlayerCount();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    public boolean removePlayer(Player p, Room r) {
        if(rooms.contains(r)) {
            if(rooms.get(rooms.indexOf(r)).removePlayer(p)) {
                updatePlayerCount();
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
