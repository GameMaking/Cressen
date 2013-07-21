package cressen.console;

import cressen.exception.NoConsoleFoundException;
import java.io.Console;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patrick
 */
public class TheConsole {
    
    private Console console;

    public TheConsole() {
        try {
            initConsole();
        } catch (NoConsoleFoundException ex) {
            Logger.getLogger(TheConsole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getInput(String s) {
        if(console != null) {
            return console.readLine(s);
        } else {
            return null;
        }
    }
    
    private void initConsole() throws NoConsoleFoundException{
        console = System.console();
        if(console == null) {
            throw new NoConsoleFoundException();
        }
    }
}
