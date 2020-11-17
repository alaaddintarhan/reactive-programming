package com.attin.reactive.r9RxJava.rx03ObserverDesignPattern;

public class EndUser implements Observer {

    private String name;


    public EndUser(String name, SubjectLibrary subjectLibrary) {
        this.name = name;
        subjectLibrary.subscribeObserver(this);
    }

    @Override
    public void update(String avail) {
        System.out.printf("\n Hello %s , we are glad  to notify you that your book is now %s", name, avail);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
