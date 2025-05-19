package org.example.behavioural.observer;

public class WeatherStation  {
    private double temperature;

    public WeatherStation(){
        this.temperature = 12.56;
    }

    public void updateWeather(double temperature){
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        ObserverRegister.getSubscribers().forEach(subscriber -> {
            subscriber.update(this.temperature);
        });
    }

    public double getTemperature() {
        return temperature;
    }
}
