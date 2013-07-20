package textgame.command;

import textgame.chat.ChatLogger;

/**
 *
 * @author Patrick
 */
public class CommandHandler {

    private ChatLogger cl;

    public CommandHandler(ChatLogger cl) {
        this.cl = cl;
    }

    public void executeCommand(String command) {
        switch (command.toUpperCase()) {
            case "/HELP":
                helpCommand();
                break;
            default:
                System.out.println("Not a command");
                break;
        }
    }

    private void helpCommand() {
        cl.addString("=============== HELP ===============");
        cl.addString(" HELP - Shows this help text");
        cl.addString(" MAP  - Shows the map");
    }
}
