
package textgame.player;

import textgame.playerclass.PlayerClass;
import textgame.room.Room;
import textgame.playerspecies.PlayerSpecies;


/**
 *
 * @author patrick
 */
public class Player {
    
    private String username;
    private int userID;
    private int charLevel;
    private String charName;
    private String charAge;
    private PlayerSpecies charSpecies;
    private PlayerClass charClass;
    private int fieldX, fieldY;
    private Room currentRoom;

    public Player(String username, int userID, String charName, String charAge, PlayerSpecies charSpecies, PlayerClass charClass, int fieldX, int fieldY, Room currentRoom) {
        this.username = username;
        this.userID = userID;
        this.charName = charName;
        this.charAge = charAge;
        this.charSpecies = charSpecies;
        this.charClass = charClass;
        this.fieldX = fieldX;
        this.fieldY = fieldY;
        this.currentRoom = currentRoom;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getCharAge() {
        return charAge;
    }

    public void setCharAge(String charAge) {
        this.charAge = charAge;
    }

    public PlayerSpecies getCharSpecies() {
        return charSpecies;
    }

    public void setCharSpecies(PlayerSpecies charSpecies) {
        this.charSpecies = charSpecies;
    }

    public PlayerClass getCharClass() {
        return charClass;
    }

    public void setCharClass(PlayerClass charClass) {
        this.charClass = charClass;
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

    
    
    
}
