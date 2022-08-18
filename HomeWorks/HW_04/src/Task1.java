//Sergii Bugienko

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int number1 = getUserNumber();
        int number2 = getUserNumber();

        printSum(number1, number2, (number1 != number2));
        printMulti(number1, number2, (number1 != 0 && number2 != 0));
        printSubtraction(number1, number2, (number1 > number2));
        printDivision(number1, number2, (number2 != 0));

    }

    public static int getUserNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите, пожалуйста, целое число: ");
        int number = scanner.nextInt();
        return number;
    }

    static void printSum (int number1, int number2, boolean isPrinting) {
        if (isPrinting) {
            System.out.printf("Результат сложения чисел %d и %d будет: %d \n", number1, number2, number1 + number2);
        } else {
            return;
        }
    }

    static void printMulti (int number1, int number2, boolean isPrinting) {
        if (isPrinting) {
            System.out.printf("Результат умножения чисел %d и %d будет: %d \n", number1, number2, number1 * number2);
        } else {
            return;
        }
    }

    static void printSubtraction (int number1, int number2, boolean isPrinting) {
        if (isPrinting) {
            System.out.printf("Результат вычитания из числа %d числа %d будет: %d\n", number1, number2, number1 - number2);
        } else {
            return;
        }
    }

    static void printDivision (int number1, int number2, boolean isPrinting) {
        if (isPrinting) {
            double result = (1.0 * number1) / (1.0 * number2);
            System.out.printf("Результат деления числа %d  на число %d будет: %.2f \n", number1, number2, result);
        } else {
            return;
        }
    }

    //Введите, пожалуйста, целое число: 25
    //Введите, пожалуйста, целое число: 2
    //Результат сложения чисел 25 и 2 будет: 27
    //Результат умножения чисел 25 и 2 будет: 50
    //Результат вычитания из числа 25 числа 2 будет: 23
    //Результат деления числа 25  на число 2 будет: 12,50

}

//Реализовать программу, которая выводит на экран результаты сложения, вычитания, умножения и деления двух чисел.
// Каждая из арифметических операций должна быть реализована как отдельный метод.
// Метод должен принимать boolean и сразу печатать результат в консоль.
