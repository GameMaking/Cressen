
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
}
