package deuxieme_serie_exercice;
import java.io.*;
public class SauvegardePhrase {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = null;

        try {
            System.out.print("Entrez une phrase : ");
            String phrase = br.readLine();

            pw = new PrintWriter(new BufferedWriter(new FileWriter("ma-phrase.txt")));
            pw.println(phrase);

            System.out.println("La phrase a été sauvegardée dans le fichier ma-phrase.txt.");
        } catch (IOException e) {
            System.err.println("Erreur : " + e.getMessage());
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}


