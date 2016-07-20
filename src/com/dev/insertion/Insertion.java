package com.dev.insertion;

/**
 * Created by Oops on 7/20/2016.
 */
public class Insertion {
    public static void main(String arg[]) {
        int[] list = {4, 5, 2, 8, 9, 3, 7};
        Insertion b = new Insertion();
        int[] li = b.insertionSort(list);
        for (int i = 0; i < li.length - 1; i++) {
            System.out.println(li[i]);
        }
    }

    public int[] insertionSort(int[] list) {
        int i, j, key, t = 0;
        for (i = 1; i < list.length; i++) {
            key = list[i];
            j = i - 1;
            while (j >= 0 && key < list[j]) {
                t = list[j];
                list[j] = list[j + 1];
                list[j + 1] = t;
                j--;
            }
        }

        return list;
    }
}
