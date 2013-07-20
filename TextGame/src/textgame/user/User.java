
package textgame.user;

import java.util.ArrayList;

/**
 *
 * @author patrick
 */
public class User {

    private ArrayList<Character> chars;
    
    private String username;
    private String email;
    private int age;
    
    public User() {
        chars = new ArrayList<>();
    }
}
