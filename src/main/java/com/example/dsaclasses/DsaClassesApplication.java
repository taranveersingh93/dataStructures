package com.example.dsaclasses;

import DataStructures.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DsaClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsaClassesApplication.class, args);
        HashTable myHashTable = new HashTable(7);

        myHashTable.set("nails",100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);
        myHashTable.printTable();
    }

}
