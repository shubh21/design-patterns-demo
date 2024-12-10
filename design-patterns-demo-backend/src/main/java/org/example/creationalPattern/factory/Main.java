package org.example.creationalPattern.factory;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        CurrencyExchanger currencyExchanger = CurrencyExchangerFactory.getCurrencyExchanger("");
        Double value = currencyExchanger.Calculate(48.00);

    }
}
