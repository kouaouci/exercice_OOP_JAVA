import java.util.Scanner;

public class Nombre_Pair_Impair_Premier {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        //Vérifier si un nombre entré est pair, impair, premier


        // Demander une valeur à l'utilisateur
        System.out.print("Entrez un nombre entier:");
        int number = scanner.nextInt();

        // Premièrement, on vérifie si le nombre est zéro, car
        // dans ce cas le test de parité n'est pas nécessaire
        if (number == 0) {
            System.out.println("Le nombre est zéro (et il est pair)");
        } else {
            // S'il n'est pas nul, voyons quel est son signe
            if (number < 0) {
                //Note: System.out.print ne commence pas de nouvelle ligne
                System.out.print("Le nombre est négatif ");
            } else {
                System.out.print("Le nombre est positif ");
            }

            // Teste la parité: si le reste de la division par deux est zéro
            // alors le nombre est pair
            int reste = number % 2;
            boolean flag = true;

            if (reste == 0) {
                System.out.println("et pair");
            } else {
                System.out.println("et impair");
            }
            for(int i = 2; i <= number/2; i++)
            {
                //nombre est divisible par lui-meme
                reste = number%i;

                //si le reste est 0, alors arrete la boucle. Sinon continuer la boucle
                if(reste == 0)
                {
                    flag = false;
                    break;
                }
            }
            //si flag est true, alors nombre est premier, sinon non premier
            if(flag)
                System.out.println(number + " est un nombre premier");
            else
                System.out.println(number + " n'est pas un nombre premier");
        }



    }


}
