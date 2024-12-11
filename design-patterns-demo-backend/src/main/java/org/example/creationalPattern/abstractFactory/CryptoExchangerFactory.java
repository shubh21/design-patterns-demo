package org.example.creationalPattern.abstractFactory;

public class CryptoExchangerFactory extends ExchangerFactory {

    @Override
    Exchanger exchanger(String type) {
        return switch (type) {
            case "Bitcoin", "bitcoin" -> new BitcoinExchanger(1.2);
            case "Ethreum", "ethreum" -> new EthreumExchanger(2);
            case "DogeCoin", "dogecoin" -> new DogeCoinExchanger(100);
            default -> new INRExchanger(100);
        };
    }
}
