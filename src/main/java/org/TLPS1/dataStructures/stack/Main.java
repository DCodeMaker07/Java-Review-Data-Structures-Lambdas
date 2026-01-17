package org.TLPS1.dataStructures.stack;

public class Main {

    public static void main(String[] args) {
        URL google = new URL("http://www.google.com");
        URL makigas = new URL("http://www.makigas.es");

        MyStack stack = new MyStack();

        printState(stack);
        stack.push(google);
        printState(stack);
        stack.push(makigas);
        printState(stack);

        while (!stack.isEmpty()) {
            stack.pop();
            printState(stack);
        }

    }

    public static void printState(Stack stack) {

        if(stack.isEmpty()) {
            System.out.println("L=0");
        } else {
            System.out.println("L=" + stack.size() + " " + stack.peek().getUrl());
        }

    }

}
