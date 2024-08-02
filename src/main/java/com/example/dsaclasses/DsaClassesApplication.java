package com.example.dsaclasses;

import DataStructures.LinkedList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsaClassesApplication.class, args);
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        System.out.println(myLinkedList.getNodeByIndex(2).value+ "\n") ;
        myLinkedList.printList();
    }

}
