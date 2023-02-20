package gov.research;

import java.util.Arrays;

class ArraysTest {

    public static void main(String[] args) {
        int[] ages = new int[7];
        ages[0] = 56;
        ages[1] = 49;
        ages[6] = 37;
        System.out.println(ages);   //toString() is not useful and does not print any legible information
        System.out.println(Arrays.toString(ages));      //this will display legible information
        System.out.println();

        double[] prices = { 9.99, 37.49, 32.5, 49.96};
        System.out.println("prices has length; " + prices.length);
        System.out.println(prices);
        System.out.println();

        String[] names = { "Chris", "Alma", "Adel", "Amar", "Alfie" };
        System.out.println(Arrays.toString(names));
        System.out.println();

        for (String name : names) {
            System.out.println(name);
        }

    }
}