package org.example.behavioural.chainOfResponsibility;

public interface Handler<T> {

    public void setNext(Handler handler);

    public void handle(T request);
}
