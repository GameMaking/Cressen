
package textgame.item;

/**
 *
 * @author patrick
 */
public abstract class HeadEquipment extends Item{
    
    private int armor;

    public HeadEquipment(int armor, int ID, String name, float value, String type) {
        super(ID, name, value, type);
        this.armor = armor;
    }

    

    
}
