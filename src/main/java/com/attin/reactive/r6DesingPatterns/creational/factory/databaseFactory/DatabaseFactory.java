package com.attin.reactive.r6DesingPatterns.creational.factory.databaseFactory;

import com.attin.reactive.r10DesignPatterns.creational.factory.DBMS;
import com.attin.reactive.r10DesignPatterns.creational.factory.Database;
import com.attin.reactive.r10DesignPatterns.creational.factory.RDBMS;

public class DatabaseFactory {

    public static com.attin.reactive.r10DesignPatterns.creational.factory.Database getDatabase(String dbType) {

        Database db = null;
        if ("RDBS".equals(dbType))
            db = new RDBMS();
        else
            db = new DBMS();

        return db;
    }
}
