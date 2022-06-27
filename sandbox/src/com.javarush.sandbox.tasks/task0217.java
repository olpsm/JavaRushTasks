package com.javarush.sandbox.tasks;

public class task0217 {
/*
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)

Подсказка:
Нужно написать тело двух существующих функций min.

Требования:
•	Программа должна выводить текст на экран.
•	Методы min не должны выводить текст на экран.
•	Метод main должен вызывать метод min(a, b) и метод min(a, b, c, d).
•	Метод main должен выводить на экран результат работы методов min. Каждый раз с новой строки.
•	Метод min(a, b) должен возвращать минимальное значение из чисел a, b.
•	Метод min(a, b, c, d) должен использовать метод min(a, b)
•	Метод min(a, b, c, d) должен возвращать минимальное значение из чисел a, b, c, d.
 * */

    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
    int m4;
    int m1 = min(a,b);
    int m2 = min(c,d);
        if (m1 <= m2){
            m4 = m1;
        }
        else {
            m4 = m2;
        }
        return m4;
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        int m;
        if (a <= b){
            m = a;
        }
        else {
            m = b;
        }
        return m;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}


