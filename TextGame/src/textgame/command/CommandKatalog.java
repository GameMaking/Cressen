
package textgame.command;

import java.util.ArrayList;

/**
 *
 * @author Patrick
 */
public class CommandKatalog {
    
    public ArrayList<String> commands;
    
    public CommandKatalog() {
        commands = new ArrayList<>();
        initialize();
    }
    
    private void initialize() {
        addCommand("help");
        
    }
    
    public void addCommand(String command) {
        commands.add(command);
    }
    
    public void removeCommand(String command) {
        commands.remove(command);
    }
    
    public ArrayList<String> getCommands() {
        return commands;
    }
    
    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }
}
