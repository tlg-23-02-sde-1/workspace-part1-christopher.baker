import java.util.Arrays;

/*
 * Business class to model the workings of a television set.
 * No main() method here.
 */
class Television {

    // CLASS (static) VARIABLES - shared among all instances
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;
    public static int getInstanceCount() {
        return instanceCount;
    }

    //FIELDS or INSTANCE VARIABLES  attributes or properties, called "fields" or "instance variables"
    private String brand;
    private int volume;
    private DisplayType display = DisplayType.LED;
    private boolean isMuted;
    private int oldVolume;      //not exposed via get/set methods - internal use only

    //BUSINESS METHODS  functions or operations, called "methods" in Java   constructors
    public Television() {
        instanceCount++;    //instanceCount = instanceCount + 1
    }
    public Television(String brand) {
        this();
        setBrand(brand);
    }
    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }
    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        this.display = display;
    }
    public void turnOn() {  // call private method for this task
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
    }
    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }
    public void mute() {
        if(!isMuted()) {    //executes when we are not currently muted
            oldVolume = getVolume();
            setVolume(0);
            isMuted = true;
        }
        else {              //executes when we are currently muted
            setVolume(oldVolume);
            isMuted = true;
        }
    }

    // ASSESSOR METHODS - provide "controlled access" to the object's internal (private) data
    public boolean isMuted() {
        return isMuted;
    }
    public String getBrand() {
        return brand;
    }
    //data constraint: must be ["Samsung", "LG", "Sony", "Toshiba", "Magnavox"]
    public static final String [] VALID_BRANDS = { "Samsung", "LG","Sony", "Toshiba", "Magnavox" };
    public void setBrand(String brand) {

    }
        /* }switch (brand){
            case "Samsung": case "LG": case "Sony": case "Toshiba": case "Magnavox":
                this.brand = brand;
                break;  //once you have a match it will stop running
            default:
                System.out.println("Invalid brand: " + brand + ", valid brands are: " + Arrays.toString(Television.VALID_BRANDS));
        }
    }
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
        public void setVolume (int volume){
            if (MIN_VOLUME <= volume && volume <= MAX_VOLUME) {
                System.out.println("The volume is within range of 0-100");
                this.volume = volume;
            } else {
                System.out.printf("Invalid volume: %s, volume must be in-between %s-%s\n", volume, MIN_VOLUME, MAX_VOLUME);
//                System.out.println("Invalid volume " + volume + ". Volume must be in " + MIN_VOLUME + " -" + MAX_VOLUME);
            }
        }

        public DisplayType getDisplay() {
            return display;
        }

        public void setDisplay(DisplayType display) {
            this.display = display;
        }

        private boolean verifyInternetConnection () {
            return true;            // fake implementation
        }
        //toString()
        public String toString() {
            String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
            return String.format("Television: brand=%s, volume=%s, display=%s", getBrand(), volumeString, getDisplay());
//            return "Television: brand=" + getBrand() + ", volume=" + volumeString + getDisplay();
        }
}
