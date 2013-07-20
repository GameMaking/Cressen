
package textgame.world.room;

import java.util.ArrayList;

/**
 *
 * @author patrick
 */
public class Room {
    
    private int ID;
    private String name;
    private ArrayList<Character> chars;
    
    public Room(int ID, String name) {
        this.ID = ID;
        this.name = name;
        chars = new ArrayList<>();
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
    
    public int getID() {
        return ID;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setChars(ArrayList<Character> chars) {
        this.chars = chars;
    }
    
    public ArrayList<Character> getChars() {
        return chars;
    }

}
