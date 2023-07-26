import java.util.Scanner;
public class Games {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Moves fulmine = new Moves("fulmine", 60);
        Moves codacciaio = new Moves("codacciaio", 30);
        Moves azione = new Moves("azione", 20);
        Moves lanciafiamme = new Moves("lanciafiamme", 90);
        
        //Mio pokemon 
        Pokemon p1 = new Pokemon("Pikachu", 190, 60 , fulmine, codacciaio);

        //Pokemon nemici
        String enemyName = in.nextLine();
        Pokemon enemy = new Pokemon(enemyName, 150, 99 , azione, lanciafiamme);

        System.out.println("\n\nIl tuo Pokemon è: "+p1.getName());
        System.out.println("Cyrus schiera: "+enemyName);
        
        p1.attacca(enemy);
    }
}
