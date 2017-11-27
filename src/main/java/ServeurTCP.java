import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeurTCP {

    private ServerSocket serverSocket;
    private Socket chatSocket;
    private PrintWriter writer;

    public ServeurTCP(int portLoc) throws IOException {

        serverSocket = new ServerSocket(portLoc);
        chatSocket = serverSocket.accept();
        writer = new PrintWriter(chatSocket.getOutputStream());
        writer.println("Vous êtes connécté !");
        writer.close();
    }


}
