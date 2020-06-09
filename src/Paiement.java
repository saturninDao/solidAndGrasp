public class Paiement implements IPaiement {

    private int datePaiement;
    private double montant;
    private String etat;
    private double montantTotal;
    private String modePaiement;

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
