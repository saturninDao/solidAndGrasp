import java.util.List;

public class Reservation implements IReservation {
    Internaute internaute;
    Session session;
    Paiement paiement;
    List<Pelerin> pelerins; //Plusieurs pelerins peuvent etre enregistrés lors de la souscription

    public Reservation(Internaute internaute, Session session, Paiement paiement, List<Pelerin> pelerins) {
        this.internaute = internaute;
        this.session = session;
        this.paiement = paiement;
        this.pelerins = pelerins;
    }

    public Internaute getInternaute() {
        return internaute;
    }

    public void setInternaute(Internaute internaute) {
        this.internaute = internaute;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }

    public List<Pelerin> getPelerins() {
        return pelerins;
    }

    public void setPelerins(List<Pelerin> pelerins) {
        this.pelerins = pelerins;
    }

    @Override
    public void modifierReservation() {

    }

    @Override
    public boolean supprimerReservation() {
        return false;
    }


}
