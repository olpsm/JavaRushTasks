package com.javarush.sandbox.tasks;

public class task0205 {
    /*
           Требования:
•	Программа должна выводить текст на экран.
•	Метод main не должен вызывать System.out.println или System.out.print.
•	Метод hackSalary не должен возвращать результат.
•	Метод main должен вызвать метод hackSalary только один раз.
•	Метод hackSalary должен увеличить переданное число на 100 и вывести на экран надпись согласно шаблону.

           * */

    public static void main(String[] args) {
        hackSalary(700);        //зарплата
    }

    public static void hackSalary(int salary) {
        // напишите тут ваш код
        System.out.println(salary+100);
    }

}


