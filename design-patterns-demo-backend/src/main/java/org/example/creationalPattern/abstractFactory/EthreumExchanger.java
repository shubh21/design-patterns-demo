package org.example.creationalPattern.abstractFactory;

public class EthreumExchanger implements Exchanger {

    private final double exchangeRate;

    public EthreumExchanger(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public double exchange(double gbp) {
        return exchangeRate*gbp;
    }
}
