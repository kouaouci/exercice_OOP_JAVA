import Application_Bank.entité.Client;
import Application_Bank.entité.Compte_Bancaire;
import Application_Bank.service.CompteService;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println ( "Hello world!" );
        // se qui concerne l'application banque

        CompteService cs = new CompteService ();
        ArrayList<Compte_Bancaire> compte_bancaires = cs.getAllCompte (); // chargement des comptes bancaires à partir du fichier CSV
        for (Compte_Bancaire b : compte_bancaires) {
            System.out.println ( b.getNuméroDeCompte () + " " + b.getMontant () );
        }

        Client client1 = new Client ( "Marc", "Dutoo" );
        client1.postCompteBancaire ( compte_bancaires.get ( 0 ) );
        client1.postCompteBancaire ( compte_bancaires.get ( 1 ) );


        Client client2 = new Client ( "Marc", "felix" );
        client2.postCompteBancaire ( compte_bancaires.get ( 2 ) );
        client2.getCompteBancaire ( compte_bancaires.get ( 3 ).getNuméroDeCompte () );
        cs.virement ( client1.getCompteBancaire ( 0 ),client2.getCompteBancaire (0  ),50 );

    }
}
