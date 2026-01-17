package org.TLPS1.search;

public class sequentialSearch {

    public static boolean search(int[] array, int e) {

        int i = 0;
        char band = 'F';

        while((band == 'F') && i < array.length) {
            if(array[i] == e) {
                band = 'V';
            }
            i++;
        }

        if (band == 'V') System.out.println("El numero fue encontrado en la posición: " + (i - 1));

        return band == 'V';

    }

}
