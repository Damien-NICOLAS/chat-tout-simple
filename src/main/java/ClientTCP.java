import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


public class ClientTCP {
    private final static int port = 5555;

    private Socket chatSocket;
    private InputStreamReader stream;
    private BufferedReader reader;

    public ClientTCP(String adresseHost, int port) throws IOException {
        chatSocket = new Socket(InetAddress.getByName(adresseHost), port);
        stream = new InputStreamReader(chatSocket.getInputStream());
        reader = new BufferedReader(stream);
        String message = reader.readLine();

        System.out.println("Test de connexion :"+message);


    }


}
