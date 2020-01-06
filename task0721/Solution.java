package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = 0;
        int minimum = 0;

        //напишите тут ваш код
        int[] array = new int[20];

        for (int i = 0 ; i < array.length ; i++){
            array[i] = Integer.parseInt(reader.readLine());
            if(i == 0){
                maximum = array[i];
                minimum = array[i];
            }
            if(maximum < array[i]){
                maximum = array[i];
            }
            if(minimum > array[i]){
                minimum = array[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
