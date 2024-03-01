import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Implémentation de l'interface Calculateur
public class CalculateurImpl extends UnicastRemoteObject implements Calculateur {

    // Constructeur par défaut qui lève une exception RemoteException
    protected CalculateurImpl() throws RemoteException {
        super();
    }

    // Méthode pour réaliser une opération sur la calculatrice
    @Override
    public calculette realise_operation() throws RemoteException {
        // Création d'une nouvelle instance de la calculatrice
        calculette c = new calculette();
        // Retourne la calculatrice créée
        return c;
    }
}

