package org.example.behavioural.chainOfResponsibility;

public abstract class AbstractBaseHandler<T> implements Handler<T>{

    private Handler<T> nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    // Implementation of passToNext
    protected void passToNext(T request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        } else {
            System.out.println("No handler available to process: " + request);
        }
    }

    // Abstract method that concrete handlers must implement
    public abstract void handle(T request);
}
