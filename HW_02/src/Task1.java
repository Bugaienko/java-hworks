import java.util.Scanner;

// Sergii Bugaienko
public class Task1 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int number1;
        int number2;
        System.out.print("Enter first number: ");
        number1 = scan.nextInt();
        System.out.print("Enter second number: ");
        number2 = scan.nextInt();
        System.out.println("=======================");
        System.out.println();
        System.out.println("The result of adding numbers is: " + (number1 + number2));
        System.out.println("The result of subtracting numbers is: " + (number1 - number2));
        System.out.println("The result of multiplying numbers is: " + (number1 * number2));
        System.out.println("The result of division by an integer is: " + (number1 / number2));
        System.out.println("The remainder of the division of numbers is: " + (number1 % number2));


    }
}

//    First level: Задача 1.
//     Напишите программу, которая получает два целых числа от пользователя и отображает 5 изученных математических операций
//     (сложение, вычитание, умножение, деление нацело, остаток от деления)