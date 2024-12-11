package org.example.creationalPattern.factory;

public class CurrencyExchangerFactory {

    static CurrencyExchanger getCurrencyExchanger(String choice){

        return switch (choice) {
            case "EURO", "euro" -> new EuroExchanger(1.2);
            case "SGD", "sgd" -> new SGDExchanger(2);
            default -> new INRExchanger(100);
        };
    }
}
