import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task0132 {
/*
Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.

Пример вывода:
15

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Метод sumDigitsInNumber(int) должен быть публичным и статическим.
•	Метод sumDigitsInNumber должен возвращать значение типа int.
•	Метод sumDigitsInNumber не должен ничего выводить на экран.
•	Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
 * */

    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int s1 = number/100;
        int s2 = (number - s1*100)/10;
        int s3 = number - s1*100 - s2*10;
        return s1+s2+s3;
    }
//sdfsdf
    }



