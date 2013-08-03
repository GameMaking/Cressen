
package cressen.character;

/**
 *
 * @author Patrick
 */
public abstract class CClass {

    private int health;
    private int mana;
    private int attack;
    private int magicAttack;
    private int defence;
    private int magicDefence;
    
    public CClass(int health, int mana, int attack, int magicAttack, int defence, int magicDefence) {
        this.health = health;
        this.mana = mana;
        this.attack = attack;
        this.magicAttack = magicAttack;
        this.defence = defence;
        this.magicDefence = magicDefence;
    }
    
    public void addHealth(int points) {
        health += points;
    }
    
    public void removeHealth(int points) {
        health -= points;
    }
    
    public void addMana(int points) {
        mana += points;
    }
    
    public void removeMana(int points) {
        mana -= points;
    }
    
    public void addAttack(int points) {
        attack += points;
    }
    
    public void removeAttack(int points) {
        attack -= points;
    }
    
    public void addMagicAttack(int points) {
        magicAttack += points;
    }
    
    public void removeMagicAttack(int points) {
        magicAttack -= points;
    }
    
    public void addDefence(int points) {
        defence += points;
    }
    
    public void removeDefence(int points) {
        defence -= points;
    }
    
    public void addMagicDefence(int points) {
        magicDefence += points;
    }
    
    public void removeMagicDefence(int points) {
        magicDefence -= points;
    }
    
}
