package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        boolean isOrdered = true;

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
            if(i > 0){
                int num = i;
                if(list.get(num).length() < list.get(--num).length()){
                    isOrdered = false;
                }
            }
        }
        if(isOrdered == false) {
            for (int i = 0; i < 10; i++) {
                if (i > 0) {
                    int num = i;
                    if (list.get(num).length() < list.get(--num).length()) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}

