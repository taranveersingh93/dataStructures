package com.example.dsaclasses;

import DataStructures.DoublyLinkedList;
import DataStructures.LinkedList;
import DataStructures.Stack;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsaClassesApplication.class, args);
        Stack myStack = new Stack(4);
        myStack.push(55);
        myStack.pop();
        myStack.push(3);
        myStack.printStack();
    }

}
