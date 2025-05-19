package org.example.creationalPattern.abstractFactory;

public class INRExchanger implements Exchanger {

    private final double exchangeRate;

    public INRExchanger(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public double exchange(double gbp) {
        return this.exchangeRate*gbp;
    }
}
