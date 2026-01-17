package org.TLPS1.dataStructures.binaryTree;

public interface IBST<T extends Comparable> {

    void insert(T empl);

    boolean exists(int id);

    T get(int id);

    boolean isLeaf();

    boolean isTreeEmpty();

    void preOrder();

    void inOrder();

    void postOrder();

    void delete(int id);

}
