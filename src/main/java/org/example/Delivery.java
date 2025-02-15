package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        int distance = 30;
        boolean dimensionsBig = true;
        boolean fragileYes = true;
        int totalPrice = 0;

        //distance
        if (distance > 30) {
            totalPrice += 300;
            System.out.println("distance > 30");
        }
        if (distance > 10 && <= 30) {
            System.out.println("distance > 10");
        } if() {
            System.out.println("distance < 2");
        }


        //габоритное
        if (dimensionsBig) {
            totalPrice += 200;
        } else {
            totalPrice += 100;
        }
        System.out.println("totalprice dimensionsBig = " + totalPrice);

        //хрупкое
        if (fragileYes && distance <= 30) {
            totalPrice += 300;
        } else if (fragileYes) {
            System.out.println("Груз хрупкий, но расстояние >30км");
        }
        System.out.println("totalprice fragileYes = " + totalPrice);

        //загруженность доставки
        ArrayList<String> busy = new ArrayList<>(Arrays.asList("low", "middle", "high", "?")); //0 1 2-high
        Random random = new Random();

        switch (busy.get(random.nextInt(busy.size()))) {
            case "low":
                totalPrice *= 1.2;
                System.out.println(1.2);
                break;
            case "middle":
                totalPrice *= 1.4;
                System.out.println(1.4);
                break;
            case "high":
                totalPrice *= 1.6;
                System.out.println(1.6);
                break;
            default:
                System.out.println("default busy");
        }

        System.out.println("totalprice pre = " + totalPrice);

        if (totalPrice < 400) {
            totalPrice = 400;
            System.out.println("totalprice default = " + totalPrice);
        } else {
            System.out.println("totalprice = " + totalPrice);
        }
    }
}
