package cressen.usermanage;

import java.util.ArrayList;

/**
 *
 * @author patrick
 */
public class UserManager {

    private ArrayList<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public User getUser(String username) {
        for (User u : users) {
            if (u.getUsername().equals(username)) {
                return u;
            }
        }
        return null;
    }

    public boolean checkUser(String username, String password) {
        for (User u : users) {
            if (u.getUsername().equals(username)) {
                if (u.getPassword().equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }
}
