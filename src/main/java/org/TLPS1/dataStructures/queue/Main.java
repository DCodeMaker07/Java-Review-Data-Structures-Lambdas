package org.TLPS1.dataStructures.queue;

public class Main {

    public static void main(String[] args) {

        MyProcessQueue myProcessQueue = new MyProcessQueue();

        Work print1 = new Work("Gaaa", "test");
        Work print2 = new Work("Gaaax2", "test2");

        myProcessQueue.enqueue(print1);
        myProcessQueue.enqueue(print2);


        System.out.println(myProcessQueue);

        System.out.println("Printing: " + myProcessQueue.get());

        System.out.println("Printed");

        myProcessQueue.delete();

        System.out.println(myProcessQueue.get());

    }

}
