package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Quicksort implements SortAlgo{
    @Override
    public void sort() {
        System.out.println("You are in QuickSOrt");

    }
}
