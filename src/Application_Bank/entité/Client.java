package Application_Bank.entité;

import java.util.ArrayList;
import java.util.Date;

public class Client {

    int id;
   private String nom;
   private  String prenom;

    public Client(String nom, String prenom, ArrayList<Compte_Bancaire> compteBancaires) {
        this.nom = nom;
        this.prenom = prenom;
        this.compteBancaires = compteBancaires;
    }

    public ArrayList<Compte_Bancaire> getCompteBancaires() {
        return compteBancaires;
    }

    public void setCompteBancaires(ArrayList<Compte_Bancaire> compteBancaires) {
        this.compteBancaires = compteBancaires;
    }

    private ArrayList<Compte_Bancaire> compteBancaires;




    public Client(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


}
