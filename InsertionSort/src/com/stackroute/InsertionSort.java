package com.stackroute;

public class InsertionSort {
    /*Main method to implement Sorting*/
    public static void main(String args[]) {
        int[] num = {12, 54, 64, 23, 7};
        insertionSort(num);
        System.out.println("Sorted Array in Ascending Order: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    /*Method to sort the array*/
    public static void insertionSort(int num[]) {
        int len = num.length;
        for (int i = 1; i < len; i++) {
            int key = num[i];
            int j = i - 1;

            while (j >= 0 && key < num[j]) {
                num[j + 1] = num[j];
                --j;
            }
            num[j + 1] = key;
        }
    }

}
