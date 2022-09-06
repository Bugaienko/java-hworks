package com.homeworks.hw9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static com.homeworks.hw9.Task1.inputNewArray;

// Sergii Bugaienko
public class Task3 {
    final static Scanner SCANNER = new Scanner(System.in);
    final static  Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] array = {4, 54, 14, -10, 54, 22, 21, 33, 22, 20, 22, 1034, -453, 0, 17};

        System.out.println("Вы хотите задать параметры массива и число для поиска? (Введите yes/Y/да/Д)");
        String answer = SCANNER.nextLine();

        if (answer.toUpperCase().equals("YES") || answer.toUpperCase().equals("Y") || answer.toUpperCase().equals("ДА") || answer.toUpperCase().equals("Д")) {
            array = inputNewArray();
        }

        System.out.println("Какое число хотите добавить в массив?");
        int addNumber = SCANNER.nextInt();

        int[] newArr = increaseSize(array, addNumber);
        System.out.printf("Готово! Было: %s. Стало: %s \n", Arrays.toString(array), Arrays.toString(newArr));

        int[][][] arr3 = new int[2][3][4];
        for (int i = 0; i < arr3.length; i++){
            for (int j = 0; j < arr3[i].length; j++){
                for (int k = 0; k < arr3[i][j].length; k++){
                    arr3[i][j][k] = RANDOM.nextInt(100);
                }
            }
        }
        System.out.println("\n\nТеперь поработаем с трехмерным массивом\n");
        System.out.println("Исходный массив:");
        System.out.println(Arrays.deepToString(arr3));
        System.out.printf("Размерность массива: [%d][%d][%d]\n", arr3.length, arr3[0].length, arr3[0][0].length);

        int[][][] arr4;
        arr4 = increaseSize3D(arr3);
        System.out.println("\nИзмененный массив:");
        System.out.println(Arrays.deepToString(arr4));
        System.out.printf("Размерность нового массива: [%d][%d][%d]\n", arr4.length, arr4[0].length, arr4[0][0].length);

    }
    //Вы хотите задать параметры массива и число для поиска? (Введите yes/Y/да/Д)
    //no
    //Какое число хотите добавить в массив?
    //55
    //Готово! Было: [4, 54, 14, -10, 54, 22, 21, 33, 22, 20, 22, 1034, -453, 0, 17]. Стало: [4, 54, 14, -10, 54, 22, 21, 33, 22, 20, 22, 1034, -453, 0, 55, 0]
    //
    //
    //Теперь поработаем с трехмерным массивом
    //
    //Исходный массив:
    //[[[53, 89, 78, 32], [67, 47, 90, 71], [14, 13, 82, 52]], [[72, 47, 31, 27], [61, 89, 10, 25], [85, 65, 78, 79]]]
    //Размерность массива: [2][3][4]
    //
    //Измененный массив:
    //[[[53, 89, 78, 32, 0], [67, 47, 90, 71, 0], [14, 13, 82, 52, 0]], [[72, 47, 31, 27, 0], [61, 89, 10, 25, 0], [85, 65, 78, 79, 0]]]
    //Размерность нового массива: [2][3][5]

    static int[] increaseSize(int[] arr, int addNumber) {
        int[] temp = Arrays.copyOf(arr, arr.length + 1);
        temp[arr.length-1] = addNumber;
        return temp;
    }

    static int[][][] increaseSize3D(int[][][] arr) {
        int[][][] copy = new int[arr.length][arr[0].length][arr[0][0].length+1];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                copy[i][j] = Arrays.copyOf(arr[i][j], arr[i][j].length + 1);
            }
        }
        return copy;
    }
}
// Задача 3.
//Реализуйте метод int[] increaseSize(int[]), автоматически добавляющие элемент в массив в последней ячейке и возвращает массив с еще одной пустой ячейкой.
//
//Усложненный вариант задачи 3 (по желанию)
//Реализуйте аналогичный метод, который увеличит размер конечного массива на 1 для трехмерного массива.
//
//Подсказка
//Можете воспользоваться методом Arrays.copyOf
