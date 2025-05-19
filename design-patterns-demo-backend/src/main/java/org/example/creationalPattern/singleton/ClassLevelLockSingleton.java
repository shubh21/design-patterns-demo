package org.example.creationalPattern.singleton;

public class ClassLevelLockSingleton {

    private static volatile ClassLevelLockSingleton INSTANCE;

    private ClassLevelLockSingleton() {}

    public synchronized static ClassLevelLockSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ClassLevelLockSingleton();
        }
        return INSTANCE;
    }

    public static void main(String[] args){

        ClassLevelLockSingleton obj = ClassLevelLockSingleton.getInstance();
        System.out.println(obj);
    }
}
