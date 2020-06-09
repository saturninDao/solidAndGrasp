import java.util.Date;

public abstract class Utilisateur {
    public String nom;
    public String prenom;
    public Date dateNaissance;
    public String pays;
    public String sexe;

    public abstract void modifierUtilisateur();
    public abstract boolean supprimerUtilisateur();
}
