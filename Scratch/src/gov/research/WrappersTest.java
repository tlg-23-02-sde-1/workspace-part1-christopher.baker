package gov.research;

class WrappersTest {

    public static void main(String[] args) {
        String ageInput = "56";
        int age = Integer.parseInt(ageInput);
        Integer ageInteger = Integer.valueOf(ageInput);

        String popInput = "7000000000";
        long pop = Long.parseLong(popInput);
        Long popLong = Long.valueOf(popInput);

        String priceInput = "200.50";
        double price = Double.parseDouble(priceInput);
        Double priceDouble = Double.valueOf(priceInput);

        String  twinsInput = "true";
        boolean hasTwins = Boolean.parseBoolean(twinsInput);
        Boolean hasTwinsBoolean = Boolean.valueOf(hasTwins);

        System.out.println(price);
        System.out.println(priceDouble);
    }
}