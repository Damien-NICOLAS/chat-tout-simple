

import java.util.Scanner;

public class Principal {

    public static void main(){

        System.out.println("Test de connexion : entrez l'adresse IP distante et le port");
        Scanner sc = new Scanner(System.in);
        String adresse = sc.next();
        try {
            ClientTCP clientTCP = new ClientTCP(adresse);
        }catch (Exception e){
            e.printStackTrace();
        }

        





    }





}
