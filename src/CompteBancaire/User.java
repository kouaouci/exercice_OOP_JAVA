package CompteBancaire;

import java.util.Date;

public class User {

    int id;
    String nom;
    String Prénom;
    Date dateNaissance;

    public User(int id, String nom, String prénom, Date dateNaissance) {
        this.id = id;
        this.nom = nom;
        Prénom = prénom;
        this.dateNaissance = dateNaissance;
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

    public String getPrénom() {
        return Prénom;
    }

    public void setPrénom(String prénom) {
        Prénom = prénom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }


}
