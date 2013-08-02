
package cressen.character;

import java.util.ArrayList;

/**
 *
 * @author Patrick
 */
public class CharacterRegister {
    
    private ArrayList<Character> characters;
    
    public CharacterRegister() {
        characters = new ArrayList<>();
    }
    
    public void registerCharacter(Character character) {
        characters.add(character);
    }

}
