package com.facadepattern.coffee;

import com.facadepattern.barista.Barista;
import com.facadepattern.coffeemaker.CoffeeExtractor;
import com.facadepattern.coffeemaker.CoffeeGrinder;
import com.facadepattern.coffeemaker.CoffeeTamper;
import com.facadepattern.coffeemaker.SteamWand;

public class CoffeeFacade {
    private int coffeeAmount;

    public CoffeeFacade(int coffeeAmount) {
        this.coffeeAmount = coffeeAmount;
    }

    public void create_espresso(int extraction_pressure){
//        Method to create an Espresso shot
        CoffeeGrinder.grind(this.coffeeAmount);
        CoffeeTamper.tamp();
        CoffeeExtractor extractor = new CoffeeExtractor(extraction_pressure);
        extractor.extract();
        System.out.println("The Espresso is being served");
    }

    public void create_cappuccino(int extraction_pressure){
        CoffeeGrinder.grind(this.coffeeAmount);
        CoffeeTamper.tamp();
        CoffeeExtractor extractor = new CoffeeExtractor(extraction_pressure);
        extractor.extract();
        SteamWand.froth_milk();
        Barista.combine();
        System.out.println("The Cappuccino is being served");
    }

    public void create_americano(){
        CoffeeGrinder.grind(this.coffeeAmount);
        CoffeeExtractor.brew();
        System.out.println("The Americano is being served");
    }

    public void create_iced_coffee(){
        CoffeeGrinder.grind(this.coffeeAmount);
        CoffeeExtractor.brew();
        Barista.chill();
        System.out.println("The Iced Coffee is being served");
    }
}
