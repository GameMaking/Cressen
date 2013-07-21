
package cressen.user;

import java.util.ArrayList;
import cressen.character.Character;

/**
 *
 * @author patrick
 */
public class User {

    private String username;
    private String password;
    private String email;
    private String name;
    private ArrayList<Character> characters;

    public User(String username, String password, String email, String name) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }
    
    public void addCharacter(Character character) {
        characters.add(character);
    }
    
    public void removeCharacter(Character character) {
        characters.remove(character);
    }
    
    public void removeCharacter(int ID) {
        for(Character c : characters) {
            if(c.getID() == ID) {
                characters.remove(c);
            }
        }
    }
    
    public Character getCharacter(int ID) {
        for(Character c : characters) {
            if(c.getID() == ID) {
                return c;
            }
        }
        return null;
    }
}
