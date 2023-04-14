package exercice_singleton;

import java.util.Date;

public class User {
    public int id;
    public String nom;
    public String prenom;
    public int Age;
    public Date dateNaissance;

    public User(int id, String nom, String prenom, int age, Date dateNaissance) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        Age = age;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
