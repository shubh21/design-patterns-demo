package org.example.creationalPattern.abstractFactory;

public class ExchangerFactoryProvider {

    public static ExchangerFactory getFactory(String category) {
        if (category.equalsIgnoreCase("Currency")) {
            return new CurrencyExchangerFactory();
        } else if (category.equalsIgnoreCase("Crypto")) {
            return new CryptoExchangerFactory();
        }
        throw new IllegalArgumentException("Unknown Category: " + category);
    }
}
