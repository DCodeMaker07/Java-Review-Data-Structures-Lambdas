package org.TLPS1.dataStructures.linkedList;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("Test", "test", "ga");

        Book book2 = new Book("Test2", "test2", "ga2");

        List linkedList = new List();

        linkedList.insertFirst(book);
        linkedList.insertLast(book2);

        System.out.println(linkedList.getLength());

        System.out.println(linkedList.getBookAt(0));

        System.out.println(linkedList);

    }

}
