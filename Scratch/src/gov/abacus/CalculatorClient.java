package gov.abacus;

class CalculatorClient {

    public static void main(String[] args) {

        double average = Calculator.average(2, 6, 6, 5, 10);  //should be 5.8
        System.out.println("The average is:" + average);

        double sum = Calculator.add(3.1, 5.1);
        System.out.println("The sum is:" + sum);

        System.out.println("The difference is:" + Calculator.subtract(3.1, 5));

        System.out.println("10 is even? " + Calculator.isEven(10));

        System.out.println("The produce is:" + Calculator.multiply(3, 5));
        System.out.println();


        System.out.println();

        int winner = Calculator.randomInt(5, 10);
        System.out.println("The winner is:" + winner);

    }
}