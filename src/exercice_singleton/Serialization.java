package exercice_singleton;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {



    public static  void main(String[] args) {
            try {
                // Créer un objet Person
                User person = new User(1,"John", "Marc",30);

                // Créer un flux de sortie
                FileOutputStream fileOut = new FileOutputStream ("user.json");
                ObjectOutputStream out = new ObjectOutputStream (fileOut);

                // Sérialiser l'objet
                out.writeObject(person);

                // Fermer le flux de sortie
                out.close();
                fileOut.close();

                System.out.println("L'objet a été sérialisé et enregistré dans le fichier person.ser");
            } catch(IOException i) {
                i.printStackTrace();
            }
        }
    }


