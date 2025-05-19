package org.example.creationalPattern.singleton;

public class LazyInitialisationSingleton {

    private static LazyInitialisationSingleton INSTANCE ;

    private LazyInitialisationSingleton(){}

    public static synchronized LazyInitialisationSingleton  getInstance(){
        if(INSTANCE == null){
            INSTANCE = new LazyInitialisationSingleton();
        }
        return INSTANCE;
    }
}
