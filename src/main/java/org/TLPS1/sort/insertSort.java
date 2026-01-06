package org.TLPS1.sort;

public class insertSort {

    public static int[] insertSort(int[] arr) {
        int pos, aux;

        for (int i = 0; i < arr.length; i++) {
            pos = i; // 2
            aux = arr[i]; // 3

            while((pos >0) && (arr[pos - 1] > aux)) {
                arr[pos] = arr[pos-1];
                pos--;
            }

            arr[pos] = aux;

        }

        return arr;
    }

}
