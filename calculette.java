import java.io.Serializable;

// Classe représentant une calculatrice, implémente Serializable pour permettre la sérialisation
public class calculette implements Serializable {
    // Attributs de la calculatrice
    private String operation;
    private double[] operandes = new double[]{0.0};

    // Constructeur par défaut initialisant les attributs à null
    public calculette() {
        this.operation = null;
        this.operandes = null;
    }

    // Méthode pour effectuer un calcul en fonction de l'opération et des opérandes donnés
    public double effectuerCalcul(String operation, double[] operandes) {
        double resultat = 0.0;
        if (operation.equals("+")) {
            for (double operande : operandes) {
                resultat += operande;
            }
        } else if (operation.equals("-")) {
            resultat = operandes[0];
            for (int i = 1; i < operandes.length; i++) {
                resultat -= operandes[i];
            }
        } else if (operation.equals("*")) {
            resultat = 1.0;
            for (double operande : operandes) {
                resultat *= operande;
            }
        } else if (operation.equals("/")) {
            resultat = operandes[0];
            for (int i = 1; i < operandes.length; i++) {
                resultat /= operandes[i];
            }
        } else {
            // Lève une exception si l'opération n'est pas prise en charge
            throw new IllegalArgumentException("Opération non prise en charge");
        }
        return resultat;
    }

    // Méthode toString pour afficher l'opération et le résultat
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Opération : ");
        for (double operande : operandes) {
            sb.append(operande).append(" ");
        }
        sb.append("=").append(effectuerCalcul(operation, operandes));
        return sb.toString();
    }
}
