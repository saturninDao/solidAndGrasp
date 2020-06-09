import java.util.List;

public class Pack implements IPack {

    public String titrePack;
    public String descriptionPack;
    List<Session> sessions; // Puisque quand on choisit un pack on peut voir les sessions programmés
    Compte compteCreateurDuPack;

    public Pack(String titrePack, String descriptionPack, List<Session> sessions, Compte compteCreateurDuPack) {
        this.titrePack = titrePack;
        this.descriptionPack = descriptionPack;
        this.sessions = sessions;
        this.compteCreateurDuPack = compteCreateurDuPack;
    }

    public String getTitrePack() {
        return titrePack;
    }

    public void setTitrePack(String titrePack) {
        this.titrePack = titrePack;
    }

    public String getDescriptionPack() {
        return descriptionPack;
    }

    public void setDescriptionPack(String descriptionPack) {
        this.descriptionPack = descriptionPack;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    public Compte getCompteCreateurDuPack() {
        return compteCreateurDuPack;
    }

    public void setCompteCreateurDuPack(Compte compteCreateurDuPack) {
        this.compteCreateurDuPack = compteCreateurDuPack;
    }

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
