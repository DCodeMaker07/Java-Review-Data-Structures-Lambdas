package org.TLPS1.dataStructures.linkedList;

public class List {

    private Node head = null;

    private int length = 0;

    private class Node {

        public Book book;
        public Node next = null;

        public Node(Book book) {
            this.book = book;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "book=" + book +
                    ", next=" + next +
                    '}';
        }
    }

    public void insertFirst(Book book) {
        Node node = new Node(book);
        node.next = head;
        head = node;
        length++;
    }

    public void insertLast(Book book) {
        Node node = new Node(book);

        if(head == null) {
            this.head = node;
        } else {
            Node pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = node;
            length++;
        }
    }

    public void insertMiddle(int i, Book book) {
        Node node = new Node(book);

        if(head == null){
            this.head = node;
        } else {
            Node pointer = head;

            int counter = 0;

            while (counter < i && pointer.next != null) {
                pointer = pointer.next;
                counter++;
            }

            node.next = pointer.next;
            pointer.next = node;
            length++;
        }

    }

    public Book getBookAt(int n) {
        if (head == null) return null;

        Node pointer = head;

        int counter = 0;

        while (counter < n && pointer.next != null) {
            pointer = pointer.next;
            counter++;
        }
        if(counter != n) return null;

        return pointer.book;

    }

    public int getLength() {
        if (head == null) return 0;

        return length;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void deleteFirst() {
        if (head == null) return;

        Node first = head;
        head = head.next;
        first.next = null;
        length--;
    }

    public void deleteLast() {
        if (head == null) return;

        if(head.next == null){
            head = null;
        } else {
            Node pointer = head;

            while(pointer.next.next != null) {
                pointer = pointer.next;
            }

            pointer.next = null;
            length--;
        }

    }

    public void deleteBook(int n){

        if (head == null) return;

        if(n == 0) {
            Node first = head;
            head = head.next;
            first.next = null;
            length--;
        } else if(n < length){
            Node pointer = head;
            int counter = 0;

            while (counter < (n - 1)) {
                pointer = pointer.next;
                counter++;
            }

            Node temp = pointer.next;
            pointer.next = temp.next;
            temp.next = null;
            length--;
        }

    }

    @Override
    public String toString() {
        return "List{" +
                "head=" + head +
                ", length=" + length +
                '}';
    }
}
