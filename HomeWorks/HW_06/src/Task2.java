import java.util.Scanner;

//Sergii Bugaienko
public class Task2 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        String inputStr = "";

        while (true) {
            inputStr = getInput();
            if (!checkingInput(inputStr)) {
                System.out.println("Предыдущий ввод не будет прибавлен. Вы ввели некорректное значение :-(");
                continue;
            }

            number = parserInt(inputStr);
            if (number != 0) {
                sum += number;
            } else {
                break;
            }
        }

        System.out.printf("\nСумма введенных чисел равна: %d", sum);

        //Введите целое число: 14
        //Введите целое число: -14
        //Введите целое число: 12ю5
        //Предыдущий ввод не будет прибавлен. Вы ввели некорректное значение :-(
        //Введите целое число: аспва
        //Предыдущий ввод не будет прибавлен. Вы ввели некорректное значение :-(
        //Введите целое число: 1
        //Введите целое число: 45
        //Введите целое число: -44
        //Введите целое число: 0
        //
        //Сумма введенных чисел равна: 2


    }
    static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        return scanner.nextLine();
    }

    static boolean checkingInput(String strInput) {
        String regExpInt = "(-?)(\\d+)";
        return strInput.matches(regExpInt);
    }

    static int parserInt(String str) {
        return Integer.parseInt(str);
    }

}

//задание 2
//Реализуйте программу, которая считывает целые числа со сканера и выводит сумму всех введенных целых чисел.
// Программа завершится при вводе 0. Допустимо введение отрицатеьных чисел.
