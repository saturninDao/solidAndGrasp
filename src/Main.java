import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String...arg){
        System.out.println("*********** Bienvenue chez ALHAJU ***********");

        Compte admin1 = new Compte("joel","joel1994");
        Compte admin2 = new Compte("saturnin","saturnin1994");
        Utilisateur internaute1 = new Internaute("Kodjo",
                "KOMLAN",
                "02/1999",
                "TOGO",
                "MASCULIN",
                "GOOGLE",
                "13RueDuCommerce",
                "LOME",
                "TOGO",
                8080,
                "91362179",
                "komlan@gmail.com");

        // Ajout de session
        Session session1 = new Session(1500000,"Session Janvier",admin1);
        Session session2 = new Session(2500000,"Session Février",admin2);
        Session session3 = new Session(3500000,"Session Mars",admin1);
        Session session4 = new Session(5500000,"Session Avril",admin2);

        //Edition d'une session
        session1.setDetailsSession("Session Mai");

        List<Session> listeDeSessionsPackBronze = new ArrayList<Session>();
        List<Session> listeDeSessionsPackArgent = new ArrayList<Session>();
        listeDeSessionsPackBronze.add(session1);
        listeDeSessionsPackBronze.add(session2);
        listeDeSessionsPackArgent.add(session3);
        listeDeSessionsPackBronze.add(session4);

        //Ajout de packs
        List<Pack> packsDuSite = new ArrayList<Pack>();
        Pack pack1 = new Pack("Bronze","A moindre cout",listeDeSessionsPackBronze,admin1);
        Pack pack2 = new Pack("Argent","Prix moyen",listeDeSessionsPackArgent,admin2);
        packsDuSite.add(pack1);
        packsDuSite.add(pack2);

        //Edition d'un pack
        pack1.setTitrePack("Bronze(entrée de gamme)");

        Utilisateur pelerin1 = new Pelerin("Koffi",
                "Kodjo",
                "23/11/1980",
                "BENIN",
                "FEMININ",
                "Chambre vip");
        Utilisateur pelerin2 = new Pelerin("SAWADOGO",
                "yves",
                "20/11/1990",
                "IVORY COAST",
                "MASCULIN",
                "Chambre vip");

        List<Pelerin> lesPelerinsAinscrire = new ArrayList<Pelerin>();
        lesPelerinsAinscrire.add((Pelerin)pelerin1);
        lesPelerinsAinscrire.add((Pelerin)pelerin2);

        Paiement premierPaiement = new Paiement(
                "27/04/1884",
                1500000,
                "payé",
                2000000,
                "Paypal");

        // Faire une reservation
        List<Reservation> reservationsDuSite = new ArrayList<>();
        Reservation reservation1 = new Reservation((Internaute) internaute1,session1,premierPaiement,lesPelerinsAinscrire);
        reservationsDuSite.add(reservation1);

        //Consultation de la liste des packs
        System.out.println("\nVoici nos differents packs ainsi que leurs sessions respectives");
            for (int i=0;i<packsDuSite.size();i++){
                System.out.println(i+1+"-"+packsDuSite.get(i).titrePack);
                for (int j=0;j<packsDuSite.get(i).getSessions().size();j++) {
                    System.out.println("  "+packsDuSite.get(i).getSessions().get(j).getDetailsSession());
                }
        }

        //Consultation de la liste des sessions
        System.out.println("\nVoici nos differentes sessions");
        for (Session session : listeDeSessionsPackBronze) {
            System.out.println(" "+session.detailsSession);
        }
        for (Session session : listeDeSessionsPackArgent) {
            System.out.println(" "+session.detailsSession);
        }

        //Consultation d'une session
        System.out.println("\nConsultation d'une session");
        System.out.println(" "+session1.afficherSession());


        //Consultation de la liste des reservation par l'administrateur
        System.out.println("\nConsultation de la liste des reservations par l'administrateur");
        for(int k=0;k<reservationsDuSite.size();k++) {
            System.out.print("Réservation: 1 | Client: " + reservationsDuSite.get(k).getInternaute().getNom() + " | Session reservée: " + reservationsDuSite.get(k).getSession().getDetailsSession() + " | Paiement: "
                    + reservationsDuSite.get(k).getPaiement().getModePaiement() + "-"
                    + reservationsDuSite.get(k).getPaiement().getDatePaiement() + "-"
                    + reservationsDuSite.get(k).getPaiement().getMontantTotal() + " | Pelerins inscrits:");
                    for (int l=0;l<reservationsDuSite.get(k).getPelerins().size();l++){
                        System.out.print(""+reservationsDuSite.get(k).getPelerins().get(l).getNom());
                    }
        }


    }
}
