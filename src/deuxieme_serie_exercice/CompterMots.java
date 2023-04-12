package deuxieme_serie_exercice;

import java.util.Scanner;

public class CompterMots {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une phrase : ");
        String phrase = sc.nextLine().trim();
        if (phrase.isEmpty()) {
            System.out.println("La phrase est vide.");
        } else {
            int nombreMots = 1;
            boolean estMot = false;

            for (int i = 0; i < phrase.length(); i++) {
                char c = phrase.charAt(i);

                if (Character.isLetterOrDigit(c)) {
                    estMot = true;
                } else if (estMot) {
                    nombreMots++;
                    estMot = false;
                }
            }

            System.out.println("Il y a " + nombreMots + " mot(s) dans votre phrase.");
        }

        sc.close();
    }
}






