package org.example.creationalPattern.factory;

public class INRExchanger implements CurrencyExchanger {

    private final double exchangeRate;

    public INRExchanger(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public Double Calculate(Double gbp) {
        return exchangeRate*gbp;
    }
}
