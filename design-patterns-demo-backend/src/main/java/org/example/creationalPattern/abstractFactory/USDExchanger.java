package org.example.creationalPattern.abstractFactory;

public class USDExchanger implements Exchanger {

    private final double exchangeRate;

    public USDExchanger(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public double exchange(double gbp) {
        return exchangeRate*gbp;
    }
}
