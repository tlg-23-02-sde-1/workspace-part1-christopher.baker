/*
 * Business class to model the workings of a television set.
 * No main() method here.
 */
class Television {

    // CLASS (static) VARIABLES - shared among all instances
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    private static int instanceCount = 0;

    public static int getInstanceCount(){
        return instanceCount;
    }

    //attributes or properties, called "fields" or "instance variables"
    //FIELDS or INSTANCE VARIABLES
    private String brand = "Toshiba";
    private int volume;
    private DisplayType display = DisplayType.LED;

    //functions or operations, called "methods" in Java
    //BUSINESS METHODS

    //constructors

    public Television(){
        instanceCount++;    //instanceCount = instanceCount + 1
    }

    public Television(String brand){
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume){
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    public void turnOn() {
        // call private method for this task
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

    //ACCESSOR METHODS
    public String getBrand() {
        return brand;
    }
    //constraint: must be ["Samsung", "LG", "Sony", "Toshiba"]
    public void setBrand(String brand) {
        /*
        switch (brand){
            case "Samsung": case "LG": case "Sony": case "Toshiba":
                this.brand = brand;
                break;
            default:
                System.out.println("Invalid brand: " + brand + ", valid brands are Samsung, LG, Sony, Toshiba");
        }
        else{System.out.println("Brand is not valid. Must be the following brands: ........");}
    }

         */

    /*
    if( brand.equals("Samsung")  ||
        brand.equals("LG")       ||
        brand.equals("Sony")     ||
        brand.equals("Toshiba"))  {
        this.brand = brand;
     }
     else {
        System.out.println("Invalid brand: " + brand + ", valid brands are Samsung, LG, Sony, Toshiba");
     }

     */

    public int getVolume() {
        return volume;
    }

    //data constraint: must be between [0-100] - use your class constraints (MIN/MAX_VOLUME)
    public void setVolume(int volume) {
        if (MIN_VOLUME <= volume && volume <= MAX_VOLUME){
            System.out.println("The volume is within range of 0-100");
            this.volume = volume;
        }
        else{
            System.out.println("Invalid volume " + volume + ". Volume must be in " + MIN_VOLUME + " -" + MAX_VOLUME);
        }
    }

    private boolean verifyInternetConnection(){
        return true;            // fake implementation
    }
    //toString()
    public String toString() {
        return "Television: brand=" + getBrand() + ", volume=" + getVolume();
    }
}