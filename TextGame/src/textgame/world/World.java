
package textgame.world;

import java.util.ArrayList;
import textgame.world.room.Room;

/**
 *
 * @author patrick
 */
public class World {

    private ArrayList<Room> rooms;
    private int ID;
    private String name;
    
    public World(int ID, String name) {
        this.ID = ID;
        this.name = name;
        rooms = new ArrayList<>();
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
