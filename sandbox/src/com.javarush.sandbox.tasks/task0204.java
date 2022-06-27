package com.javarush.sandbox.tasks;

public class task0204 {
    /*
           Требования:
   •	В методе main создай объект Man и сразу сохрани ссылку на него в переменную man.
   •	В методе main создай объект Woman и сразу сохрани ссылку на него в переменную woman.
   •	В методе main сохрани ссылку на ранее созданный объект Woman в man.wife.
   •	В методе main сохрани ссылку на ранее созданный объект Man в woman.husband.
   •	Класс Man должен содержать 3 переменные
   •	Класс Woman должен содержать 3 переменные
           * */

    public static void main(String[] args) {
        //напишите тут ваш код
        Man man = new Man();
        Woman woman = new Woman();
        man.wife = woman;
        woman.husband = man;

    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }

}


