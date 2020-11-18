package com.attin.reactive.r6DesingPatterns.creational.factory.databaseFactory;

import com.attin.reactive.r10DesignPatterns.creational.factory.Database;
import com.attin.reactive.r10DesignPatterns.creational.factory.DatabaseFactory;

public class FactoryDesignPattern {

    public static void main(String[] args) {

        Database db = null;

        db = com.attin.reactive.r10DesignPatterns.creational.factory.DatabaseFactory.getDatabase("RDMS");
        System.out.println("Database : " + db.getClass().getSimpleName());

        System.out.println(db.connect());


        db = DatabaseFactory.getDatabase("DMS");
        System.out.println("Database : " + db.getClass().getSimpleName());

        System.out.println(db.connect());
    }
}
