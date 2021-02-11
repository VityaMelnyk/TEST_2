package com.company;

public class Main {

    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        int [] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++){
            if (i != 0){
            array2[i] = array[i - 1];
        }else {
                array2[0] = array[array.length -1];
            }
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(" " + array2[i]);
        }
    }
}
