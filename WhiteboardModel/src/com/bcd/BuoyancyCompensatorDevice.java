package com.bcd;

public class BuoyancyCompensatorDevice {
    public static final int MIN_TANKS = 1;
    public static final int MAX_TANKS = 3;

    //FIELDS or INSTANCE VARIABLES

    public String color;       // Red, Black, Blue, Yellow
    public String manufacturer;// Scuba Pro, Aqualung, Cressi, Dive Rite
    public DeviceType deviceType;  // constraint: {"Jacket", "Semi-Wing", "Backplate/Wing"]
    public int tanks;          // number of tanks BCD can hold constraint: 1, 2, 3 (default 1)
    public int d_rings;        // number of D-rings that are on the BCD. (default 0)
    public boolean integratedWeights = true;



    //CONSTRUCTORS

    public BuoyancyCompensatorDevice(){
    }
    public BuoyancyCompensatorDevice(String color){
        this();
        setColor (color);
    }
    public BuoyancyCompensatorDevice(String color, String manufacturer){
        this(color);
        setManufacturer(manufacturer);
    }
    public BuoyancyCompensatorDevice(String color, String manufacturer, DeviceType deviceType){
        this(color, manufacturer);
        this.deviceType = deviceType;
    }
    public BuoyancyCompensatorDevice(String color, String manufacturer, DeviceType deviceType, int tanks){
        this(color, manufacturer, deviceType);
        this.tanks = tanks;
    }
    public BuoyancyCompensatorDevice(String color, String manufacturer, DeviceType deviceType, int tanks, int d_rings){
        this(color, manufacturer, deviceType, tanks);
        this.d_rings = d_rings;
    }
    public BuoyancyCompensatorDevice(String color, String manufacturer, DeviceType deviceType, int tanks, int d_rings, boolean integratedWeights){
        this(color, manufacturer, deviceType, tanks, d_rings);
        this.integratedWeights = integratedWeights;
    }

    //business-oriented methods
    public String getColor() {
        return color;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public int getTanks(){
        return tanks;
    }
    public int getD_rings(){
        return d_rings;
    }
    public boolean isIntegratedWeights(){
        return integratedWeights;
    }

    //data constraints: Red, Black, Blue, Yellow
    public void setColor(String color){
        if (color.equals("Red")         ||
                color.equals("Black")   ||
                color.equals("Blue")    ||
                color.equals("Yellow")) {
            this.color = color;
        }
        else {System.out.println("Invalid color: " + color + ", valid colors are Red, Black, Blue, Yellow");}
    }
    //Scuba Pro, Aqualung, Cressi, Dive Rite
    public void setManufacturer(String manufacturer){
        if (manufacturer.equals("Scuba Pro")    ||
                manufacturer.equals("Aqualung") ||
                manufacturer.equals("Cressi")   ||
                manufacturer.equals("Dive Rite")) {
            this.manufacturer = manufacturer;}
        else {
            System.out.println("Invalid manufacturer: " + ", valid manufacturers are Scuba Pro, Aqualung, Cressi, Dive Rite");}
    }
    //"Jacket", "Semi-Wing", "Backplate/Wing"
    public void setDeviceType(DeviceType deviceType){
        this.deviceType = deviceType;
    }
    public DeviceType getDeviceType() {
        return deviceType;
    }
    public void setTanks(int tanks) {
        if (MIN_TANKS <= 1 || 3 <= MAX_TANKS){
            this.tanks = tanks;
        }
        else{
            System.out.println("Invalid tank number: %s, valid range is 1 - 3");
        }
    }
    public void setD_rings(int d_rings) {
        this.d_rings = d_rings;
    }
    public void setIntegratedWeights(boolean integratedWeights){

    }
    public String toString() {
        return String.format("BCD: Color= %s, Manufacturer= %s, Device Type= %s, Tanks= %s, #D Rings= %s, Weights are integrated: %s",
                getColor(), getManufacturer(), getDeviceType(), getTanks(), getD_rings(), integratedWeights);
    }
}