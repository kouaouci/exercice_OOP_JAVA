package Premier_serie_exercice;

import java.util.Scanner;

import java.util.Random;

public class Jeujustenomber {
    public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                Random rand = new Random();
                int nombreAleatoire = rand.nextInt(100) + 1;
                int nombreJoueur, nombreCoups = 0;

                System.out.println("Bienvenue dans le jeu du juste nombre !");
                System.out.println("Je pense à un nombre entre 1 et 100...");

                do {
                    System.out.print("Entrez votre proposition : ");
                    nombreJoueur = sc.nextInt();
                    nombreCoups++;

                    if (nombreJoueur < nombreAleatoire) {
                        System.out.println("Plus grand !");
                    } else if (nombreJoueur > nombreAleatoire) {
                        System.out.println("Plus petit !");
                    } else {
                        System.out.println("Bravo, vous avez trouvé le juste nombre en " + nombreCoups + " coups !");
                    }
                } while (nombreJoueur != nombreAleatoire);

                sc.close();
            }
        }










