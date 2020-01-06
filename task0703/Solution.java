package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] strArray = new String[10];
        int [] intArray = new int[10];

        for(int i = 0; i < strArray.length; i++){
            strArray[i] = reader.readLine();
            int count = strArray[i].length();
            intArray[i] = count;
            System.out.println(intArray[i]);
        }


    }
}
