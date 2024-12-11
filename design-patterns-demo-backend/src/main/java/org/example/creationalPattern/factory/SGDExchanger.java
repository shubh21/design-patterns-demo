package org.example.creationalPattern.factory;

public class SGDExchanger implements CurrencyExchanger {

    private final double exchangeRate;

    public SGDExchanger(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public Double Calculate(Double gbp) {
        return exchangeRate*gbp;
    }
}
