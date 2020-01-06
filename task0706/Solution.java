package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int countEven = 0;
        int countOdd = 0;
        int [] array = new int[15];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
            if(i == 0){
                countEven += array[i];
            }else if(i %2 == 0){
                countEven += array[i];
            }else{
                countOdd += array[i];
            }
        }

        if(countEven > countOdd){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else{
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
