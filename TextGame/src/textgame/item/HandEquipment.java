
package textgame.item;

/**
 *
 * @author patrick
 */
public abstract class HandEquipment extends Item{
    
    private int damage;

    public HandEquipment(int damage, int ID, String name, float value, String type) {
        super(ID, name, value, type);
        this.damage = damage;
    }
    
    
}
