package com.facadepattern.coffeemaker;

public class CoffeeExtractor {
    private int extraction_pressure;

    public CoffeeExtractor(int extraction_pressure){
        this.extraction_pressure = extraction_pressure;
    }

    public int getExtraction_pressure() {
        return extraction_pressure;
    }

    public void setExtraction_pressure(int extraction_pressure) {
        this.extraction_pressure = extraction_pressure;
    }

    public void extract(){
        System.out.println("Extracting Coffee at " + this.extraction_pressure + "psi...");
    }

    public static void brew(){
    System.out.println("Brewing Coffee...");
    }
}
