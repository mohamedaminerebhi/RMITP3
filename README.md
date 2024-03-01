# Calculatrice RMI

Ce projet implémente une application de calculatrice simple utilisant l'Invocation de Méthode à Distance (RMI). Il se compose d'un composant serveur et d'un composant client qui communiquent via RMI pour effectuer des opérations arithmétiques à distance.

## Composants

### CalculServer

La classe `CalculServer` représente le composant serveur de l'application. Elle fournit une implémentation distante de l'interface `Calculateur`, permettant aux clients d'effectuer des opérations arithmétiques.

### CalculClient

La classe `CalculClient` représente le composant client de l'application. Elle se connecte au `CalculServer` via RMI et permet aux utilisateurs de saisir des opérations arithmétiques et des opérandes à exécuter à distance.

### Calculateur

L'interface `Calculateur` définit les méthodes pouvant être invoquées à distance par les clients. Elle déclare une seule méthode `realise_operation()` pour effectuer des opérations arithmétiques.

### CalculateurImpl

La classe `CalculateurImpl` fournit une implémentation de l'interface `Calculateur`. Elle effectue les opérations arithmétiques demandées par les clients.

### calculette

La classe `calculette` représente une implémentation simple de calculatrice qui effectue des opérations arithmétiques.

## Utilisation

1. Démarrez le serveur en exécutant la classe `CalculServer`.
2. Exécutez le client en exécutant la classe `CalculClient` pour vous connecter au serveur et effectuer des opérations arithmétiques à distance.

## Dépendances

- Java RMI (Invocation de Méthode à Distance)

## Comment exécuter

1. Compilez tous les fichiers Java en utilisant `javac *.java`.
2. Démarrez le serveur en exécutant `java CalculServer`.
3. Lancez le client en exécutant `java CalculClient`.

## Remarque

- Assurez-vous que le serveur est en cours d'exécution avant de démarrer le client.
- Veillez à ce que le registre RMI soit disponible sur le port par défaut (1099).

