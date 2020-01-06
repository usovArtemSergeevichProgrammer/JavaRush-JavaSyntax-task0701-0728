package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> ollList = new ArrayList<>(20);
        ArrayList<Integer> divByThree = new ArrayList<>();
        ArrayList<Integer> divByTwo = new ArrayList<>();
        ArrayList<Integer> divOther = new ArrayList<>();

        for (int i = 0; i < 20; i++){
            ollList.add(Integer.parseInt(reader.readLine()));
        }

       for (int i = 0; i < ollList.size(); i++){
           if(ollList.get(i) % 3 == 0 || ollList.get(i) % 2 == 0){
               if(ollList.get(i) % 3 == 0){
                   divByThree.add(ollList.get(i));
               }
               if(ollList.get(i) % 2 == 0){
                   divByTwo.add(ollList.get(i));
               }
           } else{
               divOther.add(ollList.get(i));
           }
       }

       printList(divByThree);
       printList(divByTwo);
       printList(divOther);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer i:list) {
            System.out.println(i);
        }
    }


}
