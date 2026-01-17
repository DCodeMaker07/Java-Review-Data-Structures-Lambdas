package org.TLPS1.search;

public class binarySearch {

    public static void search(int[] numbers, int key) {

        int inf, sup, mit = 0;
        char band = 'F';

        inf = 0;
        sup = numbers.length;

        while (inf <= sup) {

            mit = (inf+sup)/2;

            if (key == numbers[mit]) {
                band = 'V';
                break;
            }

            if (key < numbers[mit]) {
                sup = mit;
                mit = (inf+sup)/2;
            }

            if(key > numbers[mit]) {
                inf = mit;
                mit = (inf+sup)/2;
            }
        }

        if(band == 'V'){
            System.out.println("El número fue encontrado en la posición: " + mit);
        } else {
            System.out.println("El número no fue encontrado en la posición: ");
        }

    }

}
