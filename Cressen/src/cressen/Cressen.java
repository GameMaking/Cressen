
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
<<<<<<< HEAD
<<<<<<< HEAD
=======
        cressen.userManager.addUser(new User("pkkann", "rollercoaster", "pkkann@gmail.com", "Patrick Kann"));
        cressen.loginConsole.start();
        
>>>>>>> fa36c6e60ec63af66240dcb72d934bf8428277a8
=======
        cressen.userManager.addUser(new User("pkkann", "rollercoaster", "pkkann@gmail.com", "Patrick Kann"));
        cressen.loginConsole.start();
        
>>>>>>> fa36c6e60ec63af66240dcb72d934bf8428277a8
    }
}
