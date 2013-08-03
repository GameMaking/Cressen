
package textgame.character;

import java.util.Date;
import textgame.character.cclass.CClass;
import textgame.character.race.Race;
import textgame.world.World;
import textgame.world.room.Room;

/**
 *
 * @author patrick
 */
public class Character {
    
    private int ID;
    private int level;
    private String name;
    private Race race;
    private CClass cClass;
    private int fieldX, fieldY;
    private Room currentRoom;
    private World currentWorld;
    private Date creationDate;
    private Date lastLogin;

    public Character(int ID, int level, String name, Race race, CClass cClass, int fieldX, int fieldY, Room currentRoom, World currentWorld, Date creationDate, Date lastLogin) {
        this.ID = ID;
        this.level = level;
        this.name = name;
        this.race = race;
        this.cClass = cClass;
        this.fieldX = fieldX;
        this.fieldY = fieldY;
        this.currentRoom = currentRoom;
        this.currentWorld = currentWorld;
        this.creationDate = creationDate;
        this.lastLogin = lastLogin;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public CClass getcClass() {
        return cClass;
    }

    public void setcClass(CClass cClass) {
        this.cClass = cClass;
    }

    public int getFieldX() {
        return fieldX;
    }

    public void setFieldX(int fieldX) {
        this.fieldX = fieldX;
    }

    public int getFieldY() {
        return fieldY;
    }

    public void setFieldY(int fieldY) {
        this.fieldY = fieldY;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public World getCurrentWorld() {
        return currentWorld;
    }

    public void setCurrentWorld(World currentWorld) {
        this.currentWorld = currentWorld;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
    
    
    

}
