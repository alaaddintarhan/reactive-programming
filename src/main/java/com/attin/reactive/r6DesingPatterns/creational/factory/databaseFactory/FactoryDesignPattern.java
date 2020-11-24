package com.attin.reactive.r6DesingPatterns.creational.factory.databaseFactory;

public class FactoryDesignPattern {

    public static void main(String[] args) {

        Database db = null;

        db =  DatabaseFactory.getDatabase("RDMS");
        System.out.println("Database : " + db.getClass().getSimpleName());

        System.out.println(db.connect());


        db = DatabaseFactory.getDatabase("DMS");
        System.out.println("Database : " + db.getClass().getSimpleName());

        System.out.println(db.connect());
    }
}
