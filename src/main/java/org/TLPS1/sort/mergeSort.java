package org.TLPS1.sort;

public class mergeSort {

    public static void mergeSort(int[] inputArray) {

        int inputLength = inputArray.length;

        if (inputLength < 2) {
            return;
        }

        int midIndex = (inputLength / 2);
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftArray[i] = inputArray[i];
        }

        for(int i = midIndex; i < inputLength; i++) {
            rightArray[i - midIndex] = inputArray[i];
        }

        mergeSort(leftArray); // [3, 7] - [2, 3, 7, 16]
        mergeSort(rightArray); // [2, 16] - [4, 9,, 11, 24]

        // Merge
        merge(inputArray, leftArray, rightArray);

    }

    private static void merge(int[] inputArray, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if(leftArray[i] <= rightArray[j]) {
                inputArray[k] = leftArray[i];
                i++;
            }else {
                inputArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            inputArray[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            inputArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

}
