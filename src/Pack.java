import java.util.List;

public class Pack implements IPack {

    public String titrePack;
    public String descriptionPack;
    List<Session> sessions; // Puisque quand on choisit un pack on peut voir les sessions programmés
    Compte compteCreateurDuPack;

    @Override
    public void modifierPack() {

    }

    @Override
    public boolean supprimerPack() {
        return false;
    }

    @Override
    public void listePack() {

    }
}
