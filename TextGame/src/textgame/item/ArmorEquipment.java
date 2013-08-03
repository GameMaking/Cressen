
package textgame.item;

/**
 *
 * @author patrick
 */
public abstract class ArmorEquipment extends Item{
    
    private int armor;

    public ArmorEquipment(int armor, int ID, String name, float value, String type) {
        super(ID, name, value, type);
        this.armor = armor;
    }

    

    
}
