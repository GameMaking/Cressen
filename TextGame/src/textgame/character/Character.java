
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
    
    private int level;
    private String name;
    private Race race;
    private CClass cClass;
    private int fieldX, fieldY;
    private Room currentRoom;
    private World currentWorld;
    private Date creationDate;
    private Date lastLogin;
    

}
