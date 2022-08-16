import java.util.Scanner;

//Sergej Bugaienko
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя пользователя: ");
        String name = scanner.next();
        char firstLetter = name.trim().charAt(0);
        System.out.println("\nВаше имя начинается с символа: " + firstLetter);

        //Введите имя пользователя:    Sergey
        //
        //Ваше имя начинается с символа: S
    }
}

//Задание 2.
//Напишите программу, которая запрашивает имя пользователя и отображает на экране “Ваше имя начинается с символа …..”.
