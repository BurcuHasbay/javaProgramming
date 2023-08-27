package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("Ankara", "Osmanix", "QA Tester", 100000, true, true, true);

        System.out.println(offer1);

        Offer offer2 = new Offer();
        offer2.setInfo("İzmir", "Burcix", "QA Tester", 120000, true, true, true);
        System.out.println(offer2);

        Offer offer3 = new Offer();
        offer3.setInfo("Kocaeli", "Eminix", "QA Tester", 90000, true, false, false);
        System.out.println(offer3);

        Offer[] myOffers = {offer1, offer2, offer3};
        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p -> !p.isFullTime);
        System.out.println(fullTimeOffers.size());
        System.out.println("---------------------------");

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p -> !p.location.equalsIgnoreCase("İzmir"));
        System.out.println(localOffers.size());


    }


}
