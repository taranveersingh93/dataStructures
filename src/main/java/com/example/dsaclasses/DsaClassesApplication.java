package com.example.dsaclasses;

import DataStructures.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DsaClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsaClassesApplication.class, args);
        BinarySearchTree myBST = new BinarySearchTree(47);


        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);
        myBST.insert(27);
        System.out.println(myBST.contains(76));
        System.out.println(myBST.contains(21));
        System.out.println(myBST.contains(17));

    }

}
