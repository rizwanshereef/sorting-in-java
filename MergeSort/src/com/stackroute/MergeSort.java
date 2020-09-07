package com.stackroute;

public class MergeSort {
    /* Main method to call mergeSort*/
    public static void main(String args[]) {
        int arr[] = {40, 51, 22, 45, 1, 4, 90, 23, 17, 55};
        MergeSort objOne = new MergeSort();
        objOne.sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
    }

    /*Method to merge the splitted array and sort */
    void merge(int arr[], int beg, int mid, int end) {
        int left = mid - beg + 1;
        int right = end - mid;
        int leftArray[] = new int[left];
        int rightArray[] = new int[right];
        for (int i = 0; i < left; ++i)
            leftArray[i] = arr[beg + i];
        for (int j = 0; j < right; ++j)
            rightArray[j] = arr[mid + 1 + j];
        int i = 0, j = 0;
        int k = beg;
        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < left) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < right) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    /* Method to split the array recursively and invoke merge method*/
    void sort(int arr[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            sort(arr, beg, mid);
            sort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }

}

