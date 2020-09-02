package com.stackroute;

public class QuickSort {

        public static void main(String[] args) {
            int itr;
            int[] arr={45,23,69,30,65,88,67,89,34,23};
            quickSort(arr, 0, 9);
            System.out.println("The sorted array is:");
            for(itr=0;itr<10;itr++)
                System.out.println(arr[itr]);
        }
/*Method to partition the array */
        public static int partition(int a[], int start, int end)
        {
            int left, right, temp, loc, flag;
            loc = left = start;
            right = end;
            flag = 0;
            while(flag != 1)
            {
                while((a[loc] <= a[right]) && (loc!=right))
                    right--;
                if(loc==right)
                    flag =1;
                else if (a[loc]>a[right])
                {
                    temp = a[loc];
                    a[loc] = a[right];
                    a[right] = temp;
                    loc = right;
                }
                if(flag!=1)
                {
                    while((a[loc] >= a[left]) && (loc!=left))
                        left++;
                    if(loc==left)
                        flag =1;
                    else if(a[loc] <a[left])
                    {
                        temp = a[loc];
                        a[loc] = a[left];
                        a[left] = temp;
                        loc = left;
                    }
                }
            }
            return loc;
        }
/*Method to implement quick sorting*/
        static void quickSort(int a[], int beg, int end)
        {
            int loc;
            if(beg<end)
            {
                loc = partition(a, beg, end);
                quickSort(a, beg, loc-1);
                quickSort(a, loc+1, end);
            }
        }
    }
