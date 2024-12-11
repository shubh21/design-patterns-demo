package org.example.creationalPattern.abstractFactory;

public class EuroExchanger implements Exchanger {

    private final double exchangeRate;

    public EuroExchanger(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public double exchange(double gbp) {
        return this.exchangeRate*gbp;
    }
}
