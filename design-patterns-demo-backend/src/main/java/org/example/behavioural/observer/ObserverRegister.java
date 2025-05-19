package org.example.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverRegister {

    private static final List<Subscriber> subscriberList = new ArrayList<>();

    private ObserverRegister(){

    }

    public static void addSubscriber(Subscriber o){
        subscriberList.add(o);
    }

    public static void deleteSubscriber(Subscriber o){
        subscriberList.remove(o);
    }

    public static List<Subscriber> getSubscribers(){
        return subscriberList.stream().toList();
    }

}
