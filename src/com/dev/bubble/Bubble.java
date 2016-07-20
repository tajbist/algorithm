package com.dev.bubble;

/**
 * Created by Oops on 7/20/2016.
 */
public class Bubble {
    public static void main(String arg[]) {
        int[] list = {4, 5, 2, 8, 9, 3, 7};
        Bubble b = new Bubble();
        int[] li = b.bubbleSort(list);
        for (int i = 0; i < li.length - 1; i++) {
            System.out.println(li[i]);
        }
    }


    public int[] bubbleSort(int[] list) {
        int i, j, temp = 0;
        for (i = 0; i < list.length - 1; i++) {
            for (j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        return list;
    }
}
