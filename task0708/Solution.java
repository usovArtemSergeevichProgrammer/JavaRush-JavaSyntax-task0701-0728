package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int moreLength = 0;
        strings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i < 5; i++){
            int leng = 0;
            strings.add(sc.nextLine());
            leng = strings.get(i).length();
            if(leng > moreLength){
                moreLength=leng;
            }
        }

        for(int i = 0;i < strings.size();i++){
            if(strings.get(i).length()== moreLength){
                System.out.println(strings.get(i));
            }
        }
    }
}
