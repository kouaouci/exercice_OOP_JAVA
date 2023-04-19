package Application_Bank.entité;

import java.util.ArrayList;
import java.util.Date;

public class Client {


    private String nom;
    private String prenom;
    private ArrayList<Compte_Bancaire> compteBancaires;

    public Client(String nom, String prenom, ArrayList<Compte_Bancaire> compteBancaires) {
        this.nom = nom;
        this.prenom = prenom;
        this.compteBancaires = compteBancaires;
    }

    public Client(String nom, String prenom) {

        this.nom = nom;
        this.prenom = prenom;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public ArrayList<Compte_Bancaire> getCompteBancaires() {
        return compteBancaires;
    }

    public void setCompteBancaires(ArrayList<Compte_Bancaire> compteBancaires) {
        this.compteBancaires = compteBancaires;
    }
    //get une seul compte bancaire
    public Compte_Bancaire getCompteBancaire(int id){
        return compteBancaires.get ( id );
    }
    // inserer un un nouveau compte
    public void postCompteBancaire (Compte_Bancaire compteBancaire){
        this.compteBancaires.add ( compteBancaire );
    }



}


