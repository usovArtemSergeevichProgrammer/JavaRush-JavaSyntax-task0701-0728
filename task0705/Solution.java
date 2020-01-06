package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[20];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        int [] arrayFirst = new int[10];
        int [] arraySecond = new int[10];

        for(int i = 0; i < 10; i++){
            arrayFirst[i] = array[i];
            arraySecond[i] = array[10 + i];
        }

        for(int i = 0; i < 10; i++){
            System.out.println(arraySecond[i]);
        }
    }
}
