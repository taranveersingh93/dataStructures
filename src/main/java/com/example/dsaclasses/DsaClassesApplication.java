package com.example.dsaclasses;

import DataStructures.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DsaClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsaClassesApplication.class, args);
        Heap myHeap = new Heap();
        myHeap.insert(99);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(58);
        System.out.println(myHeap.getHeap());
        myHeap.insert(100);
        System.out.println(myHeap.getHeap());
        myHeap.insert(75);
        System.out.println(myHeap.getHeap());
    }

}
