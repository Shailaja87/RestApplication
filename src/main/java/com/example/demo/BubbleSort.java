package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class BubbleSort implements SortAlgo{

    public void sort(){

        System.out.println("Your in BubbleSort");
    }
}
