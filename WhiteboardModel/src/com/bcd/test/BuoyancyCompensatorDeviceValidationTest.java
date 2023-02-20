package com.bcd.test;

import com.bcd.BuoyancyCompensatorDevice;
import com.bcd.DeviceType;

public class BuoyancyCompensatorDeviceValidationTest {

    public static void main(String[] args) {
        BuoyancyCompensatorDevice bcd = new BuoyancyCompensatorDevice();

        System.out.println();

        bcd.setColor("Red");
        System.out.println("Color: " + bcd.getColor());
        System.out.println();

        bcd.setManufacturer("Scuba Pro");
        System.out.println("Manufacturer: " + bcd.getManufacturer());
        System.out.println();

        bcd.setDeviceType(DeviceType.JACKET);
        System.out.println("Device Type: " + bcd.getDeviceType());
        System.out.println();

        bcd.setTanks(1);
        System.out.println("Tank Number: " + bcd.getTanks());
        System.out.println();

        bcd.setD_rings(3);
        System.out.println("D Ring Number: " + bcd.getD_rings());
        System.out.println();

        bcd.setIntegratedWeights(true);
        System.out.println("BCD has Integrated Weights: " + bcd.isIntegratedWeights());

    }
}