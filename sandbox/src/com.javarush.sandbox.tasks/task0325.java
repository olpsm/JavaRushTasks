import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0325 {
/*
Ввести с клавиатуры число n.
Вывести на экран надпись "Я буду зарабатывать $n в час".

Пример:
Я буду зарабатывать $50 в час

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное число n.
•	Выведенный тест должен полностью соответствовать заданию.
 * */

    public static void main(String[] args) throws Exception {
        String n = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println("Я буду зарабатывать "+ n + " в час");

    }

    }



