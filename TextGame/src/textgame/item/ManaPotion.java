
package textgame.item;

/**
 *
 * @author patrick
 */
public class ManaPotion extends Item{

    private int manaGain;

    public ManaPotion(int manaGain, int ID, String name, float value, String type) {
        super(ID, name, value, type);
        this.manaGain = manaGain;
    }
    
    
}
