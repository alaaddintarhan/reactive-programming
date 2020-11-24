package com.attin.reactive.r6DesingPatterns.creational.factory.databaseFactory;


import com.attin.reactive.r6DesingPatterns.creational.factory.databaseFactory.impl.DBMS;
import com.attin.reactive.r6DesingPatterns.creational.factory.databaseFactory.impl.RDBMS;

public class DatabaseFactory {

    public static Database getDatabase(String dbType) {

        Database db = null;
        if ("RDBS".equals(dbType))
            db = new RDBMS();
        else
            db = new DBMS();

        return db;
    }
}
