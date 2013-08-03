
package textgame.chat;

import java.util.ArrayList;

/**
 *
 * @author Patrick
 */
public class ChatLogger {
    
    private ArrayList<String> log;
    
    public ChatLogger() {
        log = new ArrayList<>();
    }
    
    public void addString(String s) {
        log.add(" > " + s);
    }
    
    public String getLog() {
        String l = "";
        
        for(String s : log) {
            l += s + "\n";
        }
        
        return l;
    }

}
