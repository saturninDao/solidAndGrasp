import java.util.List;

public class Reservation implements IReservation {
    Internaute internaute;
    Session session;
    Paiement paiement;
    List<Pelerin> pelerins; //Plusieurs pelerins peuvent etre enregistrés lors de la souscription

    @Override
    public void modifierReservation() {

    }

    @Override
    public boolean supprimerReservation() {
        return false;
    }
}
