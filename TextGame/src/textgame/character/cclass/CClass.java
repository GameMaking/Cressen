
package textgame.character.cclass;

/**
 *
 * @author patrick
 */
public abstract class CClass {
    
    private int health;
    private int mana;
    private int defence;
    private int attack;
    private int rangedAttack;
    private int magicAttack;
    private int magicDefence;

    public CClass(int health, int mana, int defence, int attack, int rangedAttack, int magicAttack, int magicDefence) {
        this.health = health;
        this.mana = mana;
        this.defence = defence;
        this.attack = attack;
        this.rangedAttack = rangedAttack;
        this.magicAttack = magicAttack;
        this.magicDefence = magicDefence;
    }
}
