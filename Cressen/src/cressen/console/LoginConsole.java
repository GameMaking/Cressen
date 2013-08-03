
package cressen.console;

import cressen.user.UserManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patrick
 */
public class LoginConsole extends TheConsole{
    
    private UserManager userManager;
    private CharacterConsole charConsole;

    public LoginConsole(UserManager userManager, CharacterConsole charConsole) {
        this.userManager = userManager;
        this.charConsole = charConsole;
    }
    
    public void start() {
        super.clear();
        System.out.println("=====Login===========");
        System.out.println("L - Login");
        System.out.println("=====================");
        String input = super.getInput(">: ");
        
        switch(input.toUpperCase()) {
            case "L":
                login();
                break;
            default:
                System.out.println("Thats not a command... shitback!");
                start();
                break;
        }
    }
    
    private void login() {
        super.clear();
        System.out.println("=====Login===========");
        String username = super.getInput("Username>: ");
        String password = super.getInput("Password>: ");
        super.clear();
        System.out.println("Checking you...");
        try {
            Thread.sleep(20);
        } catch (InterruptedException ex) {
            Logger.getLogger(LoginConsole.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(userManager.checkUser(username, password)) {
            charConsole.start(userManager.getUser(username));
        } else {
            System.out.println("FUCk off..");
        }
    }
}
