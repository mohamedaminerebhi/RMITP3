import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculateur extends Remote {

    calculette  realise_operation() throws RemoteException ;
}
