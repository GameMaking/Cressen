
package textgame.item;

/**
 *
 * @author patrick
 */
public abstract class OffHandEquipment extends Item{
    
    private int defence;

    public OffHandEquipment(int defence, int ID, String name, float value, String type) {
        super(ID, name, value, type);
        this.defence = defence;
    }

}
