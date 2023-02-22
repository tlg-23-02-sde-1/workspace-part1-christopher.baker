package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;

/*
 * Application "main-class" (class with a main() class).
 * We'll create a few instances of Television and give them a basic test drive.
 */
class TelevisionClient {
    // STARTING point for any standalone Java application
    // The application "starts here"

    public static void main(String[] args) {

        System.out.println(Television.getInstanceCount() + " instances have been created");
        System.out.println();

        try {
            Television tv1 = new Television();
            // then call setters individually, then turnOn(), turnOff()
            tv1.setBrand("Samsung");
            tv1.setVolume(1);
            tv1.setDisplay(DisplayType.OLED);
            tv1.turnOn();
            tv1.turnOff();

            Television tv2 = new Television("Sony", Television.MIN_VOLUME);
            tv2.turnOn();
            tv2.turnOff();

            Television tv3 = new Television();
            tv3.setBrand("Sony");
            tv3.setVolume(Television.MIN_VOLUME);
            tv3.turnOn();
            tv3.turnOff();

            Television tv4 = new Television("LG");
            tv4.turnOn();
            tv4.turnOff();
            System.out.println();

            System.out.println(tv1.toString());
            System.out.println(tv2);  //toString() automatically called
            System.out.println(tv3);
            System.out.println(tv4);
            System.out.println();
        } catch (InvalidBrandException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(Television.getInstanceCount() + " instances have been created");

    }

}