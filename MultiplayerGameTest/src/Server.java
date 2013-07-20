
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


/**
 *
 * @author patrick
 */
public class Server {
    
    static ServerSocket serverSocket;
    static Socket socket;
    static DataOutputStream out;

    public static void main(String[] args) throws Exception {
        System.out.println("Server starting");
        serverSocket = new ServerSocket(7777);
        System.out.println("Server started");
        System.out.println("Waiting for connection");
        socket = serverSocket.accept();
        System.out.println("Connected to: " + socket.getInetAddress());
        out = new DataOutputStream(socket.getOutputStream());
        System.out.println("Sending test message");
        out.writeUTF("Test message");
        System.out.println("Message sent. server shutting down");
    }
}
