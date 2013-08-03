
package cressen;

import cressen.console.CharacterConsole;
import cressen.console.LoginConsole;
import cressen.console.TheConsole;
import cressen.user.User;
import cressen.user.UserManager;

/**
 *
 * @author patrick
 */
public class Cressen {
    
    private CharacterConsole charConsole;
    private UserManager userManager;
    private TheConsole theConsole;
    private LoginConsole loginConsole;
    
    public Cressen() {
        charConsole = new CharacterConsole();
        userManager = new UserManager();
        theConsole = new TheConsole();
        loginConsole = new LoginConsole(userManager, charConsole);
    }

    public static void main(String[] args) {
        Cressen cressen = new Cressen();
        cressen.userManager.addUser(new User("pkkann", "rollercoaster", "pkkann@gmail.com", "Patrick Kann"));
        cressen.loginConsole.start();
        
    }
}
