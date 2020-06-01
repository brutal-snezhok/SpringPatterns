package com.tsyrulik.singleton.antipattern;

public class TaxCalculator {

    private NdsResolver ndsResolver = new RussianNdsResolver();

    public double withNds(double price) {
         return ndsResolver.getNds() * price + price;
    }

}
