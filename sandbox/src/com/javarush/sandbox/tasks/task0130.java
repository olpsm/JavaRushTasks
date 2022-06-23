package com.javarush.sandbox.tasks;

public class task0130 {
    /*
Требования:
    Метод convertCelsiusToFahrenheit(int) должен быть публичным и статическим.
•	Метод convertCelsiusToFahrenheit должен возвращать значение типа double.
•	Метод convertCelsiusToFahrenheit не должен ничего выводить на экран.
•	Метод convertCelsiusToFahrenheit должен правильно переводить градусы Цельсия в градусы Фаренгейта и возвращать это число.
           * */

    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        //напишите тут ваш код
        double farhrenheit =  celsius * 9.0 / 5 + 32;
        return farhrenheit;
    }

}


