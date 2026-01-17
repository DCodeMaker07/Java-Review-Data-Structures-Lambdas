package org.TLPS1.dataStructures.binaryTree;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//
//        Employee e1 = new Employee(4, "Pepito Pérez", "Ventas", "A-252");
//        Employee e2 = new Employee(2, "Ana López", "Recursos Humanos", "A-198");
//        Employee e3 = new Employee(6, "Elena Nito", "Ventas", "A-241");
//        Employee e4 = new Employee(1, "josé Gómez", "Contabilidad", "B-96");
//        Employee e5 = new Employee(3, "Francisco Pérez", "Marketing", "A-69");
//        Employee e6 = new Employee(5, "Javier López", "Informática", "B-161");
        //Employee e7 = new Employee(7, "Steve Sanchez", "Informática", "B-168");
        Employee e1 = new Employee(20, "Pepito Pérez", "Ventas", "A-252");
        Employee e2 = new Employee(44, "Ana López", "Recursos Humanos", "A-198");
        Employee e3 = new Employee(18, "Elena Nito", "Ventas", "A-241");
        Employee e4 = new Employee(33, "josé Gómez", "Contabilidad", "B-96");
        Employee e5 = new Employee(64, "Francisco Pérez", "Marketing", "A-69");
        Employee e6 = new Employee(55, "Javier López", "Informática", "B-161");

        BST bst = new BST();

        Arrays.asList(e1, e2, e3, e4, e5, e6).forEach(bst::insert);

        bst.delete(20);

        bst.preOrder();

        //System.out.println("Está vacío: " + bst.isTreeEmpty() + " - Es hoja: " + bst.isLeaf());

        //bst.insert(e1);

        //System.out.println("Está vacío: " + bst.isTreeEmpty() + " - Es hoja: " + bst.isLeaf());

        //bst.insert(e2);

        //System.out.println("Está vacío: " + bst.isTreeEmpty() + " - Es hoja: " + bst.isLeaf());

        //bst.insert(e1);

        //search(bst, 44);
        //search(bst, 5);

    }

    private static void search(BST bst, int id) {
        if(bst.exists(id)) {

            System.out.println(bst.get(id));

        } else {
            System.out.println("There is no such employee " + id);
        }
    }

}
