package com.attin.reactive.r10ReactiveX.rx03observerDesignPattern;

public interface SubjectLibrary {

    public void subscribeObserver(Observer observer);

    public void unsubscribeObserver(Observer observer);

    public void notifyObserver();

}
