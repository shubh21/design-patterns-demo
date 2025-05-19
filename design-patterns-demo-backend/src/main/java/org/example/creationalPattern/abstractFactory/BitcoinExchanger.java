package org.example.creationalPattern.abstractFactory;

public class BitcoinExchanger implements Exchanger {

    private final double exchangeRate;

    public BitcoinExchanger(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public double exchange(double gbp) {
        return exchangeRate*gbp;
    }
}
