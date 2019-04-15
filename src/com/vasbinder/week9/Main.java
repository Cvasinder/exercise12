package com.vasbinder.week9;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    /*
    Cam Vasbinder
    4/10/2019
     */

    public static void main(String[] args) {
        Queue<Integer> newQueue = new Queue<>();
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
        newQueue.displayQueue();
        newQueue.dequeue();
        newQueue.displayQueue();
        newQueue.dequeue();
        newQueue.displayQueue();
    }
}

class Queue<E>{
    private ArrayList<E> elements = new ArrayList<>();


    public void enqueue(E type){
        elements.add(type);
    }
    public void dequeue(){
        elements.remove(0);
    }
    public void displayQueue(){
        System.out.println(elements);
    }
}