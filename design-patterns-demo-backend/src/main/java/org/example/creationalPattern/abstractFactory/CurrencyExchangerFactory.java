package org.example.creationalPattern.abstractFactory;


public class CurrencyExchangerFactory extends ExchangerFactory {

    @Override
    Exchanger exchanger(String type) {
        return switch (type) {
            case "EURO", "euro" -> new EuroExchanger(1.2);
            case "USD", "usd" -> new USDExchanger(2);
            default -> new INRExchanger(100);
        };
    }
}
