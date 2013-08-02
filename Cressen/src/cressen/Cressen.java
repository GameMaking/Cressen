
package cressen;

<<<<<<< HEAD
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
        
=======
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
        
        cressen.crecHandler.createCharacter(1, "TestChar", "Male", 1, 2);
>>>>>>> 771543780a4d335c97b88b8b325058d7e6d7c3d9
    }

}
