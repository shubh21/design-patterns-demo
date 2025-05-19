package org.example.creationalPattern.abstractFactory;

public class DogeCoinExchanger implements Exchanger {

    private final double exchangeRate;

    public DogeCoinExchanger(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public double exchange(double gbp) {
        return exchangeRate*gbp;
    }
}
