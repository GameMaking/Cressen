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

    public World(String worldName, int worldID, int maxPlayers) {
        this.rooms = new ArrayList<>();
        this.worldName = worldName;
        this.worldID = worldID;
        this.maxPlayers = maxPlayers;
    }
    
    public String getWorldName() {
        return worldName;
    }
    
    public int getWorldID() {
        return worldID;
    }
    
    public int getMaxPlayers() {
        return maxPlayers;
    }
    
    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }
    
    public int getCurrentPlayerCount() {
        updatePlayerCount();
        return playerCount;
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
