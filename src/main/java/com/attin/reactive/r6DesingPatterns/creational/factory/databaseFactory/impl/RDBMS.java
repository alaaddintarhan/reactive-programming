package com.attin.reactive.r6DesingPatterns.creational.factory.databaseFactory.impl;

import com.attin.reactive.r10DesignPatterns.creational.factory.Database;

public class RDBMS implements Database {

    @Override
    public String connect() {
        return "Connection Successful with RDBMS";
    }
}