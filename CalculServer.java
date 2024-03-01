import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

// Classe représentant le serveur RMI
public class CalculServer {
    public static void main(String[] args) {
        try {
            // Création de l'implémentation du service de calcul
            Calculateur cal = new CalculateurImpl();

            // Création et démarrage du registre RMI sur le port 1099
            LocateRegistry.createRegistry(1099);

            // Enregistrement de l'objet distant dans l'annuaire RMI sous le nom "Calculateur"
            Naming.bind("Calculateur", cal);

            // Affichage d'un message pour indiquer que le serveur est en écoute
            System.out.println("Le Calculateur vous entend ......");
        } catch (Exception e) {
            // Gestion des exceptions
            e.printStackTrace();
        }
    }
}

