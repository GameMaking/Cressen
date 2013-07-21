package cressen.console;

import cressen.user.User;
import cressen.character.Character;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patrick
 */
public class CharacterConsole extends TheConsole {

    private User user;

    public CharacterConsole() {
    }

    public void start(User user) {
        super.clear();
        this.user = user;
        System.out.println("=====Characters===========");
        switch (user.getCharacters().size()) {
            case 0:
                createCharacter();
                break;
            default:
                characterSelection();
                break;
        }
    }

    private void characterSelection() {
        super.clear();
        System.out.println("=====Character selection===========");
        switch (user.getCharacters().size()) {
            case 1:
                System.out.println("1: " + user.getCharacters().get(0).getID());
                System.out.println("-----------------------------------");
                System.out.println("C: Create new character");
                System.out.println("R: Remove character");
                switch (super.getInput(">: ").toUpperCase()) {
                    case "1":

                        break;
                    case "C":
                        createCharacter();
                        break;
                    case "R":

                        break;
                    default:
                        System.out.println("Not a command...");
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(CharacterConsole.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        characterSelection();
                        break;
                }
                break;
            case 2:
                System.out.println("1: " + user.getCharacters().get(0).getID());
                System.out.println("2: " + user.getCharacters().get(1).getID());
                System.out.println("-----------------------------------");
                System.out.println("C: Create new character");
                System.out.println("R: Remove character");
                switch (super.getInput(">: ").toUpperCase()) {
                    case "1":

                        break;
                    case "2":

                        break;
                    case "C":
                        createCharacter();
                        break;
                    case "R":

                        break;
                    default:
                        System.out.println("Not a command...");
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(CharacterConsole.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        characterSelection();
                        break;
                }
                break;

            case 3:
                System.out.println("1: " + user.getCharacters().get(0).getID());
                System.out.println("2: " + user.getCharacters().get(1).getID());
                System.out.println("3: " + user.getCharacters().get(2).getID());
                System.out.println("-----------------------------------");
                System.out.println("You got the maximum of 3 characters");
                System.out.println("R: Remove character");
                switch (super.getInput(">: ").toUpperCase()) {
                    case "1":

                        break;
                    case "2":

                        break;
                    case "3":

                        break;
                    case "R":

                        break;
                    default:
                        System.out.println("Not a command...");
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(CharacterConsole.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        characterSelection();
                        break;
                }
                break;
            default:

                break;
        }
    }

    private void createCharacter() {
        super.clear();
        System.out.println("=====Create character===========");
        String id = super.getInput("ID>: ");
        user.addCharacter(new Character(Integer.valueOf(id)));
        characterSelection();
    }
}
