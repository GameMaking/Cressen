
package textgame.item;

/**
 *
 * @author patrick
 */
public abstract class Item {
    
    private int ID;
    private String name;
    private float value;
    private String type;

    public Item(int ID, String name, float value, String type) {
        this.ID = ID;
        this.name = name;
        this.value = value;
        this.type = type;
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

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
