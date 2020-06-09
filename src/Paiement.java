public class Paiement implements IPaiement {

    private String datePaiement;
    private double montant;
    private String etat;
    private double montantTotal;
    private String modePaiement;


    public Paiement(String datePaiement, double montant, String etat, double montantTotal, String modePaiement) {
        this.datePaiement = datePaiement;
        this.montant = montant;
        this.etat = etat;
        this.montantTotal = montantTotal;
        this.modePaiement = modePaiement;
    }

    public String getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(String datePaiement) {
        this.datePaiement = datePaiement;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(String modePaiement) {
        this.modePaiement = modePaiement;
    }


    @Override
    public void modifierPaiement() {

    }

    @Override
    public boolean supprimerPaiement() {
        return false;
    }

    @Override
    public boolean validerPaiement() {
        return false;
    }
}
