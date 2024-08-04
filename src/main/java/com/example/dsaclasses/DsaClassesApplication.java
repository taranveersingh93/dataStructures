package com.example.dsaclasses;

import DataStructures.DoublyLinkedList;
import DataStructures.LinkedList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsaClassesApplication.class, args);
        DoublyLinkedList myDLL = new DoublyLinkedList(0);
        myDLL.append(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.printList();

        System.out.println(myDLL.getByIndex(1).value+"\n");
        System.out.println(myDLL.getByIndex(2).value+"\n");
        myDLL.printList();
    }

}
