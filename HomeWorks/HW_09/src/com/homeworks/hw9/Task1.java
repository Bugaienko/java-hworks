package com.homeworks.hw9;

// Sergii Bugaienko

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {4, 54, 14, -10, 54, 22, 21, 33, 22, 20, 22, 1034, -453, 0, 17};

        int findMeNumber = 22;

        System.out.println("Вы хотите задать параметры массива и число для поиска? (Введите yes/Y/да/Д)");
        String answer = SCANNER.nextLine();

        if (answer.toUpperCase().equals("YES") || answer.toUpperCase().equals("Y") || answer.toUpperCase().equals("ДА") || answer.toUpperCase().equals("Д")) {
            array = inputNewArray();
            findMeNumber = inputInt();
        }

        System.out.println("Результаты бинарного поиска: " + firstMatch(array, findMeNumber));

        int indexMatch = firstMatchVar1(array, findMeNumber);
        if (indexMatch >= 0) {
            System.out.printf("В массиве %s первое число %d найдено под индексом %d\n", Arrays.toString(array), findMeNumber, indexMatch);
        } else {
            System.out.printf("В массиве %s число %d не найдено\n", Arrays.toString(array), findMeNumber);
        }

        int[] arrayIndexMatch = allMatches(array, findMeNumber);

        if (arrayIndexMatch.length > 0) {
        System.out.printf("В массиве %s число %d найдено под индексами %s\n", Arrays.toString(array), findMeNumber, Arrays.toString(arrayIndexMatch));
        } else {
            System.out.printf("В массиве %s число %d не найдено\n", Arrays.toString(array), findMeNumber);
        }

        //Вы хотите задать параметры массива и число для поиска? (Введите yes/Y/да/Д)
        //дрмд
        //Результаты бинарного поиска: 9
        //В массиве [4, 54, 14, -10, 54, 22, 21, 33, 22, 20, 22, 1034, -453, 0, 17] первое число 22 найдено под индексом 5
        //В массиве [4, 54, 14, -10, 54, 22, 21, 33, 22, 20, 22, 1034, -453, 0, 17] число 22 найдено под индексами [5, 8, 10]

        //Вы хотите задать параметры массива и число для поиска? (Введите yes/Y/да/Д)
        //yes
        //Введите размер массива:
        //10
        //Введите целые числа для заполнения массива
        //10 15 21 10 55 48 5 45 56 10
        //Введите число для поиска:
        //10
        //Результаты бинарного поиска: 1
        //В массиве [10, 15, 21, 10, 55, 48, 5, 45, 56, 10] первое число 10 найдено под индексом 0
        //В массиве [10, 15, 21, 10, 55, 48, 5, 45, 56, 10] число 10 найдено под индексами [0, 3, 9]

    }

    static int[] inputNewArray() {
        String inputStr = "";
        System.out.println("Введите размер массива: ");
        while (!checkingIntInput(inputStr)) {
            inputStr = SCANNER.nextLine();
        }
        int arrayLength = Integer.parseInt(inputStr);
        int[] numbers = new int[arrayLength];
        System.out.println("Введите целые числа для заполнения массива");
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = SCANNER.nextInt();
        }
        return numbers;
    }

    static boolean checkingIntInput(String strInput) {
        String regExpPositiveInt = "(\\d+)";
        return strInput.matches(regExpPositiveInt);
    }

    static int inputInt() {
        String inputStr = "";
        System.out.println("Введите число для поиска: ");
        while (!checkingIntInput(inputStr)) {
            inputStr = SCANNER.nextLine();
        }
        return Integer.parseInt(inputStr);
    }

    static int firstMatch(int[] arr, int findMe) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        return Arrays.binarySearch(sortedArr, findMe);
    }

    static int firstMatchVar1(int[] arr, int findMe) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findMe) {
                return i;
            }
        }
        return -1;
    }

    static int[] allMatches(int[] arr, int findMe) {
        int[] temp = {};
        int lengthTemp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findMe) {
                lengthTemp++;
                int[] temp1 = Arrays.copyOf(temp, lengthTemp);
                temp1[lengthTemp - 1] = i;
                temp = temp1;
            }
        }
        return temp;
    }


}

// Задача 1.
//Реализуйте метод firstMatch. Который принимает массив целых чисел и число, необходимо вернуть
// (не распечатать в консоль, а вернуть при помощи return) индекс первого вхождения этого элемента в массив.
//Подсказка. Вы можете воспользоваться Arrays.binarySearch().
//
//
//Усложненный вариант задачи 1 (по желанию)
//Реализуйте метод allMatches. Который принимает массив целых чисел и число, необходимо вернуть
// (не распечатать в консоль, а вернуть при помощи return) массив целых чисел с индексами вхождения.
//Подсказка создайте пустой массив и расширяйте его при помощи переопределения, дозаписывая новые значения. Пройдитесь по исходному массиву циклом for.