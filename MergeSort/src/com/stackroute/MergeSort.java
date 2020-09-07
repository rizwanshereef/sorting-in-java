package com.stackroute;

public class MergeSort {
    /* Main method to call mergeSort*/
    public static void main(String args[]) {
        int arr[] = {40, 51, 22, 45, 1, 4, 90, 23, 17, 55};
        MergeSort obj1 = new MergeSort();
        obj1.sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
    }

    /*Method to merge the splitted array and sort */
    void merge(int arr[], int beg, int mid, int end) {
        int left = mid - beg + 1;
        int right = end - mid;
        int LeftArray[] = new int[left];
        int RightArray[] = new int[right];
        for (int i = 0; i < left; ++i)
            LeftArray[i] = arr[beg + i];
        for (int j = 0; j < right; ++j)
            RightArray[j] = arr[mid + 1 + j];
        int i = 0, j = 0;
        int k = beg;
        while (i < left && j < right) {
            if (LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
                i++;
            } else {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < left) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }
        while (j < right) {
            arr[k] = RightArray[j];
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

