package org.example.creationalPattern.factory;

import reactor.util.function.Tuple2;
import reactor.util.function.Tuples;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private final static Map<String,String> currencyType = Map.of("1", "INR", "2", "EURO", "3", "SGD");

    public static void main(String[] args) {

        Tuple2<String,Double> userInput= takeUserInput();

        String currency = currencyType.getOrDefault(userInput.getT1(), "INR");

        CurrencyExchanger currencyExchanger = CurrencyExchangerFactory.getCurrencyExchanger(currency);
        Double value = currencyExchanger.Calculate(userInput.getT2());
        System.out.println(value);
    }

    private static Tuple2<String,Double> takeUserInput() {
        System.out.println("Please input desired currency :");
        System.out.println("1.INR \n 2.EURO \n 3.SGD");

        Scanner sc = new Scanner(System.in);
        String choice = sc.next();

        System.out.println("Please input currency value :");
        Double value = sc.nextDouble();
        sc.close();
        return Tuples.of(choice,value);
    }
}
