package org.example.creationalPattern.factory;

public class EuroExchanger implements CurrencyExchanger {

    private final double exchangeRate;

    public EuroExchanger(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public Double Calculate(Double gbp) {

        return this.exchangeRate*gbp;
    }
}
