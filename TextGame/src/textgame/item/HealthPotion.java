
package textgame.item;

/**
 *
 * @author patrick
 */
public class HealthPotion extends Item{

    private int healthGain;

    public HealthPotion(int healthGain, int ID, String name, float value, String type) {
        super(ID, name, value, type);
        this.healthGain = healthGain;
    }
    
    
    
}
