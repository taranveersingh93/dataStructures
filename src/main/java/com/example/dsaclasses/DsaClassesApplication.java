package com.example.dsaclasses;

import DataStructures.DoublyLinkedList;
import DataStructures.LinkedList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsaClassesApplication.class, args);
        DoublyLinkedList myDLL = new DoublyLinkedList(11);
        myDLL.append(2);
        myDLL.printList();

        System.out.println(myDLL.removeFirst().value);

        System.out.println(myDLL.removeFirst().value);
        System.out.println(myDLL.removeFirst());
    }

}
