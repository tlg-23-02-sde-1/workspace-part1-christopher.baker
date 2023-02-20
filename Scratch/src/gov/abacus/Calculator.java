package gov.abacus;

/*
 * This is an "all-static" class, i.e., a class definition with mothing
 * but static methods.  These are called from the client as Calculator.methodName().
 */
class Calculator {

    /**
     * Returns the arithmetic mean (average) of the supplied integers.
     * mean(), average(), avg()
     */

    public static double average(int first, int... rest) { // 2, 6, 6, 5, 10(sum is 29)
        double result = 0.0;

        double sum = first;
        for (int value : rest) { sum += value;
        }
        result = sum / (rest.length + 1);
        return result;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(double value) {
        return value % 2 == 0;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Returns a random integer between 1 and 14 (inclusive)
     * <p>
     * HINT: see a class called math in Java API (package java.lang)
     * Look for a helpful method here to get you started.
     * Note: these methods in the Math class are all "static," which means you call them as so:
     * Math.methodName()
     * <p>
     * randomInt
     */


    public static int randomInt() {
        return randomInt (1, 14);  // delegates to the min-max version with a 1 and a 14
    }
        /**
         * Returns a random intiger between 'min' and 'max (inclusive).
         * We use the same method name as above for simplicity from the client perspective.
         * That is, the client has two "flavors" of randomInt to choose from.
         * This is called method "overloading"
         */

        public static int randomInt(int min, int max){ // ie 5 to 75
            int result = 0;

            double rand = Math.random(); // 0.0000000 to 0.9999999
            double scaled = (rand * (max - min + 1)) + min;  //5.0000000 to 0.99999999

            //truncate the decimal portion off via explicit downcast to in
            result = (int) scaled;
            return result;
        }
    }