package exercice_singleton;

import java.io.*;

public class Deserialization {
    public static void main(String[] args) {
            try {
                // Créer un flux d'entrée
                FileInputStream fileIn = new FileInputStream("user.json");
                ObjectInputStream in = new ObjectInputStream(fileIn);

                // Désérialiser l'objet
              User person = (User) in.readObject();

                // Fermer le flux d'entrée
                in.close();
                fileIn.close();

                // Afficher les propriétés de l'objet désérialisé
                System.out.println("Nom: " + person.getNom ());

            } catch(IOException i) {
                i.printStackTrace();
            } catch(ClassNotFoundException c) {
                System.out.println("La classe Person n'a pas été trouvée");
                c.printStackTrace();
            }
        }
    }



