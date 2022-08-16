import java.util.Scanner;

// Sergej Bugaienko
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя пользователя: ");
        String name = scanner.next();
        System.out.println("\nПривет, " + name + "!"); // Привет, Sergey!

    }
}


//Задание 1.
//Напишите программу, которая запрашивает имя пользователя и отображает “Привет …….. !” на экране.