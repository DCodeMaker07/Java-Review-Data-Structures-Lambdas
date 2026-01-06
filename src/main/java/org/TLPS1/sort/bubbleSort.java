package org.TLPS1.sort;

public class bubbleSort {

    public static int[] bubbleSort(int[] array) {
        int aux;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
        return array;
    }

}
