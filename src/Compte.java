public class Compte implements ICompte {

    private String pseudoCompte;
    private String motDepasse;

    public Compte(String pseudoCompte, String motDepasse) {
        this.pseudoCompte = pseudoCompte;
        this.motDepasse = motDepasse;
    }

    public String getPseudoCompte() {
        return pseudoCompte;
    }

    public void setPseudoCompte(String pseudoCompte) {
        this.pseudoCompte = pseudoCompte;
    }

    public String getMotDepasse() {
        return motDepasse;
    }

    public void setMotDepasse(String motDepasse) {
        this.motDepasse = motDepasse;
    }

    @Override
    public void modifierCompte() {

    }

    @Override
    public void supprimerCompte() {

    }

    @Override
    public void afficherCompte() {

    }

    @Override
    public boolean connexion() {
        return false;
    }

    @Override
    public boolean deconnexion() {
        return false;
    }
}
