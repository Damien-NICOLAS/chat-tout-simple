
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Avant de commencer \n1 - Serveur TCP \n2 - Serveur UDP\n3 - Client TCP\n4 - Client UDP");
        int choixUser = sc.nextInt();

        switch (choixUser){

            case 1:
                System.out.println("Entrez le numéro de port :");
                int portLocalTCP = sc.nextInt();
                try {
                    ServeurTCP serveurTCP = new ServeurTCP(portLocalTCP);
                }catch(Exception e){
                    e.printStackTrace();
                }
                break;

            case 2:
                System.out.println("Entrez le numéro de port :");
                int portLocalUDP = sc.nextInt();
                try {
                    ServeurUDP serveurUDP = new ServeurUDP(portLocalUDP);
                }catch(Exception e){
                    e.printStackTrace();
                }
                break;
            case 3:
                System.out.println("Entrez l'adresse IP de la machine distante et son port");
                System.out.print("Adresse IP : " );
                String adresseDistTCP = sc.next();
                System.out.print("Port : ");
                int portDistTCP = sc.nextInt();
                System.out.print("Entrez le message à envoyé :");
                Scanner scNew = new Scanner(System.in);
                String message = scNew.nextLine();
                try{

                    ClientUDP clientUDP = new ClientUDP(adresseDistTCP, portDistTCP, message);
                }catch (Exception e){
                    e.printStackTrace();
                }
                scNew.close();
                break;

            case 4:
                System.out.println("Entrez l'adresse IP de la machine distante et son port");
                System.out.print("Adresse IP : " );
                String adresse = sc.next();
                System.out.print("Port : ");
                int port = sc.nextInt();
                System.out.print("Entrez le message à envoyé :");
                Scanner scNewU = new Scanner(System.in);
                String messageU = scNewU.nextLine();
                try{

                    ClientUDP clientUDP = new ClientUDP(adresse, port, messageU);
                }catch (Exception e){
                    e.printStackTrace();
                }
                scNewU.close();
                break;

            default:
                System.out.println("Cas non valide");
                break;







        }
        sc.close();













    }





}
