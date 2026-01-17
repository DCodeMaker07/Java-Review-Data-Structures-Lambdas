package org.TLPS1.dataStructures.stack;

public class MyStack implements Stack {

    private class Node {

        public URL url;

        public Node next = null;

        public Node(URL url) {
            this.url = url;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "url=" + url +
                    ", next=" + next +
                    '}';
        }
    }

    private Node peek = null;
    private int length = 0;

    @Override
    public void push(URL url) {

        Node node = new Node(url);

        node.next = peek;
        peek = node;
        length++;

    }

    @Override
    public void pop() {
        if(peek != null) {
            Node deleted = peek;
            peek = peek.next;
            deleted.next = null;
            length--;
        }
    }

    @Override
    public URL peek() {
        if (peek == null) return null;

        return peek.url;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

}
