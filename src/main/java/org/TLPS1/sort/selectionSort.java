package org.TLPS1.sort;

public class selectionSort {

    public static int[] selectionSort(int[] arr) {

        int low, aux;

        for (int i = 0; i < arr.length; i++) {

            low = i;

            for (int j = i + 1; j < arr.length; j++) {

                if(arr[low] > arr[j]) {
                    low = j;
                }

            }

            aux = arr[i];
            arr[i] = arr[low];
            arr[low] = aux;

        }

        return arr;

    }

}
