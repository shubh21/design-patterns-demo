package org.example.behavioural.observer;

public class ReutersApp implements Subscriber{

    private double temperature;

    public ReutersApp() {
        this.temperature = 12;
    }

    @Override
    public void update(double temperature){
        this.temperature= temperature;
        System.out.println("Temperature is "+this.temperature+" C");
    }
}
