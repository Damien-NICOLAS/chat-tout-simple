import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


public class ClientTCP {
    private final static int port = 5555;

    private Socket socketDistante;
    private DataInputStream userInput;
    private PrintStream theOutput;

    public ClientTCP(String adresseHost) throws IOException {
        socketDistante = new Socket(InetAddress.getByName(adresseHost), port);
        BufferedReader in = new BufferedReader(new InputStreamReader(socketDistante.getInputStream()));
        PrintStream out = new PrintStream(socketDistante.getOutputStream());

        System.out.println(out);


    }


}
