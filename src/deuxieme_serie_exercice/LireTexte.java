package deuxieme_serie_exercice;

import java.io.*;

public class LireTexte {
        public static void main(String[] args) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            try {
                System.out.print("Entrez le chemin du fichier : ");
                String chemin = br.readLine();

                File fichier = new File(chemin);

                if (!fichier.exists()) {
                    System.out.println("Le fichier n'existe pas !");
                } else {
                    BufferedReader lecteur = new BufferedReader(new FileReader(fichier));
                    int nbMots = 0;

                    String ligne;
                    while ((ligne = lecteur.readLine()) != null) {
                        String[] mots = ligne.split("\\s+");
                        nbMots += mots.length;
                    }

                    System.out.println("Le fichier contient " + nbMots + " mots.");
                    lecteur.close();
                }
            } catch (IOException e) {
                System.err.println("Erreur : " + e.getMessage());
            }
        }
    }

