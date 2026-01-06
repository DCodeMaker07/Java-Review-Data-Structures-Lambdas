package org.TLPS1.sort;

public class quickSort {

    public static int[] quickSort(int[] inputArray, int left, int right) {

        int pivot = inputArray[left], aux, i = left, j = right;

        while (i < j) {

            while(inputArray[i] <= pivot && i < j) i++;

            while(inputArray[j] > pivot) j--;

            if(i < j) {
                aux = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = aux;
            }

        }

        inputArray[left] = inputArray[j];
        inputArray[j] = pivot;

        if(left < j - 1) quickSort(inputArray, left, j - 1);
        if(j + 1 < right) quickSort(inputArray, j+1, right);

        return inputArray;

    }

}
