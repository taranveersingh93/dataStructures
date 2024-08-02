package com.example.dsaclasses;

import DataStructures.LinkedList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsaClassesApplication.class, args);
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(3);
        myLinkedList.insertNodeAtIndex(0,1);
        myLinkedList.insertNodeAtIndex(3,5);
        myLinkedList.printList();
    }

}
