package com.homeworks.hw9;

import java.util.Arrays;

// Sergii Bugaienko
public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 8};
        int[] arr2 = {3, 7};

        int[] resultArr = merge(arr1, arr2);

        System.out.printf("Результат объединения массивов %s и %s будет массив: %s\n", Arrays.toString(arr1), Arrays.toString(arr2), Arrays.toString(resultArr));

        int[] arr3 = {12, 19};
        int[] arr4 = {3, 7};
        int[] resultArr2 = merge(arr3, arr4);

        System.out.printf("Результат объединения массивов %s и %s будет массив: %s\n", Arrays.toString(arr3), Arrays.toString(arr4), Arrays.toString(resultArr2));

        //Результат объединения массивов [1, 4, 6, 8] и [3, 7] будет массив: [1, 3, 4, 6, 7, 8]
        //Результат объединения массивов [12, 19] и [3, 7] будет массив: [3, 7, 12, 19]
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int resultLength = arr1.length + arr2.length;
        int[] result = Arrays.copyOf(arr1, resultLength);
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        Arrays.sort(result);
        return result;
    }

}

//Задача 2.
//
//Предположим, что есть два массива чисел, каждый из которых отсортирован в порядке возрастания.
// Реализуйте метод int[] merge(int[], int[]), который объединяет эти массивы в один отсортированный массив.
//({1,4,6,8},{3,7}) ->{1,3, 4,6,7,8}
//({12,19},{3,7}) -> {3,7,12,19}
