package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandMother1 = new Human("GrandMother-1",false,75);
        Human grandMother2 = new Human("GrandMother-2",false,77);
        Human grandFather1 = new Human("GrandFather-1",true,80);
        Human grandFather2 = new Human("GrandFather-1",true,82);
        Human mother = new Human("Mother",false,35,grandFather1,grandMother1);
        Human father = new Human("Mother",true,40,grandFather2,grandMother2);
        Human child1 = new Human("Child1",true,26,father,mother);
        Human child2 = new Human("Child2",true,23,father,mother);
        Human child3 = new Human("Child3",false,14,father,mother);
        ArrayList<Human> list = new ArrayList<>();
        list.add(grandFather1);
        list.add(grandFather2);
        list.add(grandMother1);
        list.add(grandMother2);
        list.add(father);
        list.add(mother);
        list.add(child1);
        list.add(child2);
        list.add(child3);

        for (Human h:list) {
            System.out.println(h);
        }

    }

    public static class Human {
        // напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}