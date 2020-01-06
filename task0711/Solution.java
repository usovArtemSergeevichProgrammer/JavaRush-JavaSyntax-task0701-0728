package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>(5);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }

        for(int x = 0; x < 13; x++){
            int num = list.size() - 1;
            String str = list.get(num);
            list.remove(num);
            list.add(0, str);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
