package org.example.creationalPattern.abstractFactory;

import reactor.util.function.Tuple3;
import reactor.util.function.Tuples;

import java.util.Map;
import java.util.Scanner;

public class Main {

    private final static Map<String,String> currencyType = Map.of("1", "INR", "2", "EURO", "3", "USD");
    private final static Map<String,String> exchangeType = Map.of("1", "Currency", "2", "Crypto");

    public static void main(String[] args) {

        Tuple3<String,String,Double> userInput= getUserInput();

        String exchangeCategory = exchangeType.getOrDefault(userInput.getT1(), "Currency");

        ExchangerFactory exchangerFactory = ExchangerFactoryProvider.getFactory(exchangeCategory);

        String currency = currencyType.getOrDefault(userInput.getT2(), "INR");

        Exchanger exchanger = exchangerFactory.exchanger(currency);

        Double value = exchanger.exchange( userInput.getT3());

        System.out.println(value);
    }

    private static Tuple3<String,String,Double> getUserInput() {
        System.out.println("Please select exchange category :");
        System.out.println("- For Currency press 1 \n - For Crypto Press 2 \n");

        Scanner sc = new Scanner(System.in);
        String choice = sc.next();

        String currencyType = "INR";
        String cryptoCoin;
        String type = currencyType;
        if ("1".equals(choice)) {
            System.out.println("Please input desired currency :");
            System.out.println("Press 1 for INR \n Press 2 for EURO \n Press 3 for USD");
            currencyType = sc.next();
            type = currencyType;

        } else if("2".equals(choice)){
            System.out.println("Please input desired currency :");
            System.out.println("Press 1 for Bitcoin \n Press 2 for Ethreum \n Press 3 for Dogecoin");
            cryptoCoin = sc.next();
            type = cryptoCoin;
        }

        System.out.println("Please input value to be exchanged :");
        Double value = sc.nextDouble();
        sc.close();


        return Tuples.of(choice,type, value);
    }
}
