package com.javarush.sandbox.tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class task0318 {
/*
Ввести с клавиатуры число и имя, вывести на экран строку:
"имя" захватит мир через "число" лет. Му-ха-ха!

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное имя.
•	Выведенный текст должен содержать введенное число.
•	Выведенный текст должен полностью соответствовать заданию.
 * */

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        /*
        option 1
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);
        */

        /*
        option 2*/
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int sAge = scanner.nextInt();

        /**/

        System.out.println(name+" захватит мир через " +sAge + " лет. Му-ха-ха!");
    }

    }



