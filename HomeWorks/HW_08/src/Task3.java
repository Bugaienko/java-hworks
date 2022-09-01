import java.util.Arrays;
import java.util.Scanner;

// Sergii Bugaienko
public class Task3 {
    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        String inputStr = "";
        int arrayLength;

        System.out.println("Введите размер массива: ");
        while (!checkingIntInput(inputStr)) {
            inputStr = SCANNER.nextLine();
        }
        arrayLength = Integer.parseInt(inputStr);

        int[] numbers = new int[arrayLength];
        System.out.println("Введите целые числа для заполнения массива");
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = SCANNER.nextInt();
        }

        System.out.println(checkArraySorting(numbers));
    }
    // Введите размер массива:
    //4
    //Введите целые числа для заполнения массива
    //1 2 3 4
    //true

    // Введите размер массива:
    //3
    //Введите целые числа для заполнения массива
    //1 2 0
    //false

    static boolean checkingIntInput(String strInput) {
        String regExpPositiveInt = "(\\d+)";
        return strInput.matches(regExpPositiveInt);
    }

    static boolean checkArraySorting(int[] arr) {
        boolean result = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

//Second level: Задача 3
//Напишите программу, которая читает массив целых чисел и проверяет, отсортирован ли массив по возрастанию (от наименьшего к наибольшему числу).
//Формат входных данных
//Первая строка содержит размер массива.
//Вторая строка содержит элементы массива, разделенные пробелами.
//
//
//Формат выходных данных:
//Только одно значение: true или false .
//
//
//Пример ввода 1:
//4
//1 2 3 4
//Пример вывода 1:
//true
//Пример ввода 2:
//4
//1 2 3 3 4
//Пример вывода 2:
//true
