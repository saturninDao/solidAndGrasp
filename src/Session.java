public class Session implements ISession {

    public int prixSession;
    public String detailsSession;
    Compte CreateurSession;

    public Session(int prixSession, String detailsSession, Compte createurSession) {
        this.prixSession = prixSession;
        this.detailsSession = detailsSession;
        CreateurSession = createurSession;
    }

    public int getPrixSession() {
        return prixSession;
    }

    public void setPrixSession(int prixSession) {
        this.prixSession = prixSession;
    }

    public String getDetailsSession() {
        return detailsSession;
    }

    public void setDetailsSession(String detailsSession) {
        this.detailsSession = detailsSession;
    }

    public Compte getCreateurSession() {
        return CreateurSession;
    }

    public void setCreateurSession(Compte createurSession) {
        CreateurSession = createurSession;
    }

    @Override
    public void modifierSession() {

    }

    @Override
    public boolean supprimerSession() {
        return false;
    }

    @Override
    public void listeSession() {

    }

    @Override
    public String afficherSession() {
        return getDetailsSession()+" Prix:"+getPrixSession();
    }
}
