import java.util.Date;

public class Internaute extends Utilisateur {
    private String nomEntreprise;
    private String numeroNomRue;
    private String ville;
    private String etat;
    private int codePostal;

    public Internaute(String nom, String prenom, String dateNaissance, String pays, String sexe, String nomEntreprise, String numeroNomRue, String ville, String etat, int codePostal, String telephone, String email) {
        super(nom, prenom, dateNaissance, pays, sexe);
        this.nomEntreprise = nomEntreprise;
        this.numeroNomRue = numeroNomRue;
        this.ville = ville;
        this.etat = etat;
        this.codePostal = codePostal;
        this.telephone = telephone;
        this.email = email;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getNumeroNomRue() {
        return numeroNomRue;
    }

    public void setNumeroNomRue(String numeroNomRue) {
        this.numeroNomRue = numeroNomRue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String telephone;
    private String email;


    @Override
    public void modifierUtilisateur() {

    }

    @Override
    public boolean supprimerUtilisateur() {
        return false;
    }
}
