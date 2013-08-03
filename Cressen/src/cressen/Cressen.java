
package cressen;

import cressen.character.CharacterRegister;
import cressen.character.create.CRECHandler;

/**
 *
 * @author Patrick
 */
public class Cressen {
    
    private CharacterRegister characterRegister;
    
    private CRECHandler crecHandler;
    
    public Cressen() {
        characterRegister = new CharacterRegister();
        
        crecHandler = new CRECHandler(characterRegister);
    }
    
    public static void main(String[] args) {
        Cressen cressen = new Cressen();
    }

}
