package Premier_serie_exercice;

import java.util.Scanner;
public class Exercice2 {

    public static void main(String[] args) {
        // premier exercice1
        System.out.println("Bonjour tout le monde");

        int i = 0;
        int j = 0;

        while (i < 10000) {
            i = i + 1;
            j = i + 1;

            System.out.println(j);

        }
        // renverser une chaine de caratere

        String str = "WayToLearnX";

        StringBuilder sb = new StringBuilder();

        // ajouter la chaîne dans StringBuilder
        sb.append(str);
        sb = sb.reverse();
        // afficher la chaîne inversée
        System.out.println(sb);

        }
    }



















