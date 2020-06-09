public class Internaute extends Utilisateur {
    private String nomEntreprise;
    private String numeroNomRue;
    private String ville;
    private String etat;
    private int codePostal;
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
