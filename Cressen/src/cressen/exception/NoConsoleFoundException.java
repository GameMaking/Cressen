
package cressen.exception;

/**
 *
 * @author patrick
 */
public class NoConsoleFoundException extends Exception{

    public NoConsoleFoundException() {
        super();
        System.out.println("No console was found...\nDid you run this from netbeans or eclipse? That wont work dude...");
        System.exit(-1);
    }
}
