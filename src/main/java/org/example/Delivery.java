package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Delivery {
    public static void main(String[] args) {
        int distance = 0;
        boolean dimensionsBig = false;
        boolean fragileYes = false;

        ArrayList<String> busy = new ArrayList<>(Arrays.asList("low", "middle", "high", "?")); //0 1 2-high
        Random random = new Random();
        String busyDelivery = busy.get(random.nextInt(busy.size()));

        int totalPrice = deliveryPrice(distance, dimensionsBig, fragileYes, busyDelivery);
        System.out.println(totalPrice + "!!!!!!!");
    }

    public static int deliveryPrice(int distance, boolean dimensionsBig, boolean fragileYes, String busyDelivery) {
        int totalPrice = 0;
        //distance
        if (distance > 30) {
            totalPrice += 300;
            System.out.println("distance >30 (+300)");
        }
        if (distance > 10 && distance <= 30) {
            totalPrice += 200;
            System.out.println("distance >10 <=30 (+200)");
        }
        if (distance > 2 && distance <= 10) {
            totalPrice += 100;
            System.out.println("distance >2 <=10 (+100)");
        }
        if (distance <= 2) {
            totalPrice += 50;
            System.out.println("distance <=2 (+50)");
        }


        //габоритное
        if (dimensionsBig) {
            totalPrice += 200;
            System.out.println("totalprice dimensionsBig (+200) = " + totalPrice);
        } else {
            totalPrice += 100;
            System.out.println("totalprice dimensionsBig (+100) = " + totalPrice);
        }


        //хрупкое
        if (fragileYes && distance <= 30) {
            totalPrice += 300;
            System.out.println("totalprice fragileYes (+300) = " + totalPrice);
        } else if (fragileYes) {
            System.out.println("Груз хрупкий, но расстояние >30км");
            System.out.println("totalprice fragileYes (+0) = " + totalPrice);
        }

        //загруженность доставки


        switch (busyDelivery) {
            case "low":
                totalPrice *= 1.2;
                System.out.println("busy (*1.2)");
                break;
            case "middle":
                totalPrice *= 1.4;
                System.out.println("busy (*1.4)");
                break;
            case "high":
                totalPrice *= 1.6;
                System.out.println("busy (*1.6)");
                break;
            default:
                System.out.println("default busy");
        }

        System.out.println("totalprice after busy = " + totalPrice);

        if (totalPrice < 400) {
            totalPrice = 400;
            System.out.println("totalprice default (=400) = " + totalPrice);
        } else {
            System.out.println("totalprice = " + totalPrice);
        }


        return totalPrice;
    }

}
