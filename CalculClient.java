import java.rmi.Naming;
import java.util.Scanner;

// Classe représentant le client RMI
public class CalculClient {
    public static void main(String[] args) {
        try {
            // Recherche de l'objet distant en utilisant son nom dans l'annuaire RMI
            Calculateur calcul = (Calculateur) Naming.lookup("rmi://localhost/Calculateur");

            // Affichage de la connexion réussie
            System.out.println("Le client est connecté...");

            // Création d'un scanner pour l'entrée utilisateur
            Scanner scanner = new Scanner(System.in);

            // Boucle pour continuer les calculs tant que l'utilisateur le souhaite
            while (true) {
                effectuer_calcul(calcul);

                // Demande à l'utilisateur s'il veut continuer
                System.out.println("Voulez-vous continuer [y/n]");
                String reponse = scanner.nextLine();
                if (reponse.equals("n"))
                    break;
            }
        } catch (Exception e) {
            // Gestion des exceptions
            e.printStackTrace();
        }
    }

    // Méthode pour effectuer un calcul
    private static void effectuer_calcul(Calculateur calcul) {
        try {Scanner scanner = new Scanner(System.in);
            // Appel à la méthode distante pour obtenir une instance de la calculatrice
            calculette c = calcul.realise_operation();

            // Demande de l'opération à effectuer
            System.out.println("Donnez l'opération à effectuer");
            String operation = scanner.nextLine();

            // Demande des opérandes à l'utilisateur
            System.out.println("Entrez les opérandes séparées par des espaces : ");
            String[] operandesStr = scanner.nextLine().split(" ");
            double[] operandes = new double[operandesStr.length];
            for (int i = 0; i < operandesStr.length; i++) {
                operandes[i] = Double.parseDouble(operandesStr[i]);
            }

            // Appel à la méthode distante pour effectuer le calcul
            double resultat = c.effectuerCalcul(operation, operandes);

            // Affichage du résultat
            System.out.println("Le résultat est : " + resultat);
        } catch (Exception e) {
            // Gestion des exceptions
            e.printStackTrace();
        }
    }
}
