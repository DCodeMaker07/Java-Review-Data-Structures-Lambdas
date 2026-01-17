package org.TLPS1;

import org.TLPS1.clase01.FakerUtils;
import org.TLPS1.clase01.Persona;
import org.TLPS1.search.binarySearch;
import org.TLPS1.search.sequentialSearch;
import org.TLPS1.sort.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

         int[] numbers = {1,2,3,4,5};

        //sequentialSearch.search(numbers, 10);

        binarySearch.search(numbers, 5);

        //int[] sorted = bubbleSort.bubbleSort(numbers);
        //int[] sorted = insertSort.insertSort(numbers);
        // int[] sorted = selectionSort.selectionSort(numbers);
//        int[] sorted = quickSort.quickSort(numbers, 0 , numbers.length - 1);
//
//        for (int i = 0; i < sorted.length; i++) {
//            System.out.println(sorted[i]);
//        }

        // List<Persona> personList = generatePersons(100); // in heap

        // System.out.println(personList);

//        Random rand = new Random();
//        int[] numbers = new int[10];
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = rand.nextInt(100000);
//        }
//
//        mergeSort.mergeSort(numbers);
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }


    }

    private static List<Persona> generatePersons(int n) {

        List<Persona> personas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = FakerUtils.generarNombre();
            String lastName = FakerUtils.generarApellido();

            personas.add(new Persona(name, lastName));
        }

        return personas;

    }
}
