
package cressen.character.create;

import cressen.character.*;
import cressen.character.Character;

/**
 *
 * @author Patrick
 */
public class CRECHandler {
    
    private CharacterRegister characterRegister;
    
    public CRECHandler(CharacterRegister characterRegister) {
        this.characterRegister = characterRegister;
    }
    
    public void createCharacter(int id, String name, String gender, int race, int cClass) {
        Race r = null;
        CClass c = null;
        
        switch(race) {
            case 1:
                r = new Human();
                break;
            case 2:
                r = new Orc();
                break;
            case 3:
                r = new Elf();
                break;
        }
        
        switch(cClass) {
            case 1:
                c = new Warrior();
                break;
            case 2:
                c = new Wizard();
                break;
            case 3:
                c = new Ranger();
                break;
        }
        
        Character character = new Character(id, name, gender, r, c);
        
        characterRegister.registerCharacter(character);
    }
}
