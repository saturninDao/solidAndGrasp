import java.util.Date;

public class Pelerin extends Utilisateur {
    public String typeChambre;

    public Pelerin(String nom, String prenom, String dateNaissance, String pays, String sexe,String typeChambre) {
        super(nom, prenom, dateNaissance, pays, sexe);
        this.typeChambre = typeChambre;
    }

    public String getTypeChambre() {
        return typeChambre;
    }

    public void setTypeChambre(String typeChambre) {
        this.typeChambre = typeChambre;
    }

    public void ajouterPelerin(){}

    @Override
    public void modifierUtilisateur() {

    }

    @Override
    public boolean supprimerUtilisateur() {
        return false;
    }
}
