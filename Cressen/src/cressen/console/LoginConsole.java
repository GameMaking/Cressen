
package cressen.console;

import cressen.usermanage.UserManager;

/**
 *
 * @author patrick
 */
public class LoginConsole extends TheConsole{
    
    private UserManager userManager;

    public LoginConsole(UserManager userManager) {
        this.userManager = userManager;
    }
    
    public void clear() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    public void start() {
        clear();
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
        clear();
        System.out.println("=====Login===========");
        String username = super.getInput("Username>: ");
        String password = super.getInput("Password>: ");
        clear();
        System.out.println("Checking you...");
        if(userManager.checkUser(username, password)) {
            System.out.println("Success!!!");
        } else {
            System.out.println("FUCk off..");
        }
    }
}
