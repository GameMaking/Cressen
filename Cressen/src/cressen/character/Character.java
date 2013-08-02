
package cressen.character;

/**
 *
<<<<<<< HEAD
 * @author patrick
 */
public class Character {
    
    private int ID;

    public Character(int ID) {
        this.ID = ID;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    
=======
 * @author Patrick
 */
public class Character {
    
    private int id;
    private String name;
    private String gender;
    private Race race;
    private CClass cClass;
    
    public Character(int id, String name, String gender, Race race, CClass cClass) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.race = race;
        this.cClass = cClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

>>>>>>> 771543780a4d335c97b88b8b325058d7e6d7c3d9
}
