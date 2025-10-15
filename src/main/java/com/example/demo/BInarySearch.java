package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BInarySearch {

    @Autowired
    SortAlgo quicksort;

    public int search(){
        quicksort.sort();
        System.out.println("BinarySearch");
        return 4;

    }


}
