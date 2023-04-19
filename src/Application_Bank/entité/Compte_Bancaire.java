package Application_Bank.entité;

public class Compte_Bancaire {
    private  int numéroDeCompte;

    public Compte_Bancaire() {
        this.numéroDeCompte=(int)Math.random ()*100000;
        this.montant=0;
    }

    public Compte_Bancaire(double montant) {
        this.numéroDeCompte=(int)Math.random ()*100000;
        this.montant = montant;
    }

    public Compte_Bancaire(int numéroDeCompte, double montant) {
        this.numéroDeCompte = numéroDeCompte;
        this.montant = montant;
    }

    private double montant;

    public int getNuméroDeCompte() {
        return numéroDeCompte;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}

