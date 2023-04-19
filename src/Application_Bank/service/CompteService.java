package Application_Bank.service;

import Application_Bank.entité.Compte_Bancaire;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CompteService {
    public void virement(Compte_Bancaire comptecourant, Compte_Bancaire compteepargne, double montant){
        if(comptecourant.getMontant ()<montant){
            System.out.println ("Vous avez pas assez d'argent");

        }else{
            comptecourant.setMontant ( comptecourant.getMontant ()-montant );
            compteepargne.setMontant ( compteepargne.getMontant ()+montant );
            System.out.println (String.valueOf ( montant )+"virement du compte"+ comptecourant.getNuméroDeCompte ()+ "au compte"+ compteepargne.getNuméroDeCompte ());

        }

    }

    public ArrayList<Compte_Bancaire>getAllCompte() throws FileNotFoundException{
        ArrayList<Compte_Bancaire> compte_bancaires=new ArrayList<Compte_Bancaire> ();
        Scanner sc = new Scanner ( new File ( "" ) );
        sc.useDelimiter ( "\\r" );
        while (sc.hasNext ()){
            String dataLine= sc.next ();
            String[] data= dataLine.split ( ";",2 );
            compte_bancaires.add ( new Compte_Bancaire (Integer.valueOf ( data[0].trim () ),Double.parseDouble ( data[1].trim () )) );

        }
        sc.close ();
        return compte_bancaires;
    }

}
