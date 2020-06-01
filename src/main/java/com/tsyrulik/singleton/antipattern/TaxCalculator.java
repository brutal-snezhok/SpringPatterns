package com.tsyrulik.singleton.antipattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TaxCalculator {

    private NdsResolver ndsResolver = new RussianNdsResolver();

    public double withNds(double price) {
         return ndsResolver.getNds() * price + price;
    }

}
