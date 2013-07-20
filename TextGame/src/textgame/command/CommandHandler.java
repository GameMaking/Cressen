
package textgame.command;

import java.util.ArrayList;
import textgame.chat.ChatLogger;

/**
 *
 * @author Patrick
 */
public class CommandHandler {
    
    public CommandKatalog commandKatalog;
    private ChatLogger cl;
    
    public CommandHandler(CommandKatalog commandKatalog, ChatLogger cl) {
        this.commandKatalog = commandKatalog;
        this.cl = cl;
    }

    public void executeCommand(String command) {
        if(checkCommand(command)) {
            switch(command.toUpperCase()) {
                case "HELP":
                    helpCommand();
                    break;
            }
        } else {
            System.out.println("Command not accepted");
        }
    }
    
    private void helpCommand() {
        cl.addString("=============== HELP ===============");
        cl.addString(" HELP - Shows this help text");
        cl.addString(" MAP  - Shows the map");
        cl.addString("====================================");
    }
    
    public boolean checkCommand(String command) {
        ArrayList<String> commands = commandKatalog.getCommands();
        
        for(String s : commands) {
            if(s.equalsIgnoreCase(command)) {
                return true;
            }
        }
        return false;
    }
}
