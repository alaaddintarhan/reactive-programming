package com.attin.reactive.RxJava.rx03ObserverDesignPattern;

public interface SubjectLibrary {

    public void subscribeObserver(Observer observer);

    public void unsubscribeObserver(Observer observer);

    public void notifyObserver();

}
