package org.example.creationalPattern.factory;

public class CurrencyExchangerFactory {

    public static CurrencyExchanger getCurrencyExchanger(String choice){

        switch(choice) {
            case "INR":
            case "inr":
                return new INRExchanger();
                break;

            case "EURO":
            case "euro":
                return new EuroExchanger();
                break;

            case "SGD":
            case "sgd":
                return new SGDExchanger();
                break;

            default:
                return new INRExchanger();

        }
    }
}
