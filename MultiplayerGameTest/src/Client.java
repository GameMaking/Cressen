
import java.io.DataInputStream;
import java.net.Socket;
import java.net.UnknownHostException;


/**
 *
 * @author patrick
 */
public class Client {
    
    static Socket socket;
    static DataInputStream in;

    public static void main(String[] args) throws Exception {
        System.out.println("Starting client");
        System.out.println("Connecting to server");
        socket = new Socket("localhost",7777);
        System.out.println("Connection accepted");
        in = new DataInputStream(socket.getInputStream());
        System.out.println("Receiving message");
        String message = in.readUTF();
        System.out.println("Message received: " + message);
        System.out.println("Client shutting down");
    }
}
