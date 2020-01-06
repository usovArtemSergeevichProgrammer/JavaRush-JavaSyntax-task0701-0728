package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int moreLength = 0;
        ArrayList<String> strings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i < 5; i++){
            int leng = 0;
            strings.add(sc.nextLine());
            leng = strings.get(i).length();
            if(i==0){
                moreLength = leng;
            }
            if(leng < moreLength){
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
