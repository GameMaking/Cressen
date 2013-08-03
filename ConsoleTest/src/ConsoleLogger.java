
import java.util.ArrayList;


/**
 *
 * @author patrick
 */
public class ConsoleLogger {

    private ArrayList<String> strings;
    
    public ConsoleLogger() {
        strings = new ArrayList<>();
    }
    
    public void insertString(String s) {
        strings.add("> " + s);
    }
    
    public String getLogAsString() {
        String log = "";
        for(String s : strings) {
            log += s + "\n";
        }
        return log;
    }
}
