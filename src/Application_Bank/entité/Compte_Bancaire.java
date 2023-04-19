package Application_Bank.entité;

public class Compte_Bancaire {
    private  int numéroDeCompte;
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
