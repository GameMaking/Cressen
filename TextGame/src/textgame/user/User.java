
package textgame.user;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author patrick
 */
public class User {

    private ArrayList<Character> chars;
    
    private String email;
    private int age;
    private Date creationDate;
    private Date lastLogin;

    public User(ArrayList<Character> chars, String email, int age, Date creationDate, Date lastLogin) {
        this.chars = chars;
        this.email = email;
        this.age = age;
        this.creationDate = creationDate;
        this.lastLogin = lastLogin;
    }

    public ArrayList<Character> getChars() {
        return chars;
    }

    public void setChars(ArrayList<Character> chars) {
        this.chars = chars;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
    
    
    
    
}
