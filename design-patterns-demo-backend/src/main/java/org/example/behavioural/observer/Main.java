package org.example.behavioural.observer;

public class Main {

    public static void main(String[] args){
        WeatherStation weatherStation = new WeatherStation();
        System.out.println("current temperature "+weatherStation.getTemperature());
        ReutersApp reutersApp = new ReutersApp();
        ObserverRegister.addSubscriber(reutersApp);
        weatherStation.updateWeather(18);
    }
}
