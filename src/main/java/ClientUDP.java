import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {


    public ClientUDP(String adresse, int port) throws IOException {

        byte[] data = new byte[100];

        String chainetest = "Tentative De Connexion";
        data = chainetest.getBytes();


        DatagramSocket datagramSocket = new DatagramSocket();

        DatagramPacket datagramPacket = new DatagramPacket(data, data.length);
        datagramPacket.setAddress(InetAddress.getByName(adresse));
        datagramPacket.setPort(port);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();

    }
}
