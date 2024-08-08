package com.example.dsaclasses;

import DataStructures.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DsaClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsaClassesApplication.class, args);
        Heap myHeap = new Heap();
        myHeap.insert(95);
        myHeap.insert(75);
        myHeap.insert(80);
        myHeap.insert(55);

        myHeap.insert(60);
        myHeap.insert(50);
        myHeap.insert(65);
        System.out.println(myHeap.getHeap());
        myHeap.remove();
        System.out.println(myHeap.getHeap());
        myHeap.remove();
        System.out.println(myHeap.getHeap());
    }

}
