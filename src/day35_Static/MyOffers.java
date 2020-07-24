package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.setOfferInfo("MA", "Bank of America", 100000, true);

        Offer offer2 = new Offer();
        offer2.setOfferInfo("PA", "Comcast", 110000, true);

        Offer offer3 = new Offer();
        offer3.setOfferInfo("PA", "IKEA", 120000, false);

        Offer offer4 = new Offer();
        offer4.setOfferInfo("CA", "Amazon", 130000, true);

        Offer offer5 = new Offer();
        offer5.setOfferInfo("CA", "Zoox", 90000, false);

        Offer[] offers = {offer1, offer2, offer3, offer4, offer5};

        String mylocation = "PA";

        ArrayList<Offer> accept = new ArrayList<>();

        ArrayList<Offer> Accept = new ArrayList<>(Arrays.asList(offers));
        // Accept.removeIf(  p ->  p.salary < 100000 ||  p.isFullTime == false || !p.location.equals(myLocation)  ); // we remove the offer if it's less than 100K or not full time
        Accept.removeIf(p -> p.salary < 100000);
        Accept.removeIf(p -> p.isFullTime == false);
        Accept.removeIf(p -> !p.location.equals(mylocation));

        System.out.println(Accept.size());
        for (Offer eachOffer : Accept) {
            System.out.println(eachOffer);
        }
    }
}


