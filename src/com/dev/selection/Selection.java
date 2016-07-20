package com.dev.selection;

/**
 * Created by Oops on 7/20/2016.
 */
public class Selection {
    public static void main(String arg[]) {
        int[] list = {4, 5, 2, 8, 9, 3, 7};
        Selection b = new Selection();
        int[] li = b.selectionSort(list);
        for (int i = 0; i < li.length - 1; i++) {
            System.out.println(li[i]);
        }
    }


    public int[] selectionSort(int[] list) {
        int i, j, minvalue, minIndex, temp = 0;
        for (i = 0; i < list.length; i++) {
            minvalue = list[i];
            minIndex = i;
            for (j = i; j < list.length; j++) {
                if (minvalue > list[j]) {
                    minvalue = list[j];
                    minIndex = j;
                }
            }
            if (minvalue < list[i]) {
                temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;

            }

        }

        return list;
    }
}
