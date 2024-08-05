package com.example.dsaclasses;

import DataStructures.DoublyLinkedList;
import DataStructures.LinkedList;
import DataStructures.Stack;
import DataStructures.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DsaClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsaClassesApplication.class, args);
        Queue myQueue = new Queue(7);
        myQueue.enqueue(23);

        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue());

    }

}
