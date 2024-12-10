package org.example.creationalPattern.factory;

public class EuroExchanger implements CurrencyExchanger {

    private double exchangeRate;

    @Override
    public Double Calculate(Double gbp) {

        return gbp*exchangeRate;
    }
}
