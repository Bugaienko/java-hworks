import java.util.Scanner;

// Sergii Bugaienko
public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        String inputStr = "";


        while (!checkingInput(inputStr)) {
            inputStr = getInput();
        }

        number = parserInt(inputStr);


        System.out.printf("\nФакториал числа %d равен: %d", number, factorial(number));

        //Введите целое положительное число: -1
        //Введите целое положительное число: 15.5
        //Введите целое положительное число: 15,6
        //Введите целое положительное число: retgrtgeer
        //Введите целое положительное число: 1f
        //Введите целое положительное число: 5
        //
        //Факториал числа 5 равен: 120

    }

    static boolean checkingInput(String strInput) {
        String regExpPositiveDouble = "(\\d+)(,?)(\\d*)";
        String regExpPositiveInt = "(\\d+)";
        if (!strInput.matches(regExpPositiveInt)) {
            printingErrors(strInput);
            }

        return strInput.matches(regExpPositiveInt);
    }

    static void printingErrors(String strInput) {
        System.out.println("Во вводе содержаться недопустимые символы!");
        if (strInput.matches("(.*)(\\s+)(.*)")) {
            System.out.println("В строке есть пробел");
        }
        if (strInput.matches("(.*)(,+)(.*)")) {
            System.out.println("В строке есть точка или запятая");
        }
        if (strInput.matches("((.*)[a-zA-Zа-яА-Я]+)(.*)")) {
            System.out.println("В строке есть буквы");
        }
        if (strInput.matches("(.*)(-+)(.*)")) {
            System.out.println("В строке знак минус");
        }

    }

    static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        return scanner.nextLine();
    }

    static int parserInt(String str) {
        return Integer.parseInt(str);
    }


    static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }
}

//Second level: задание 3
//реализуйте метод, который посчитает факториал целого числа.
//При помощи сканера считайте данные из консоли
//В программе должна быть проверка на корректность ввода
// (проверка на наличие пробелов "12   1", точек или запятых "12.1"/"12,1" и симфолов букв.
// проверку реализуйте при помощи регулярных выражений). Программа не должна выдавать ошибук в случае некорректного ввода данный,
// необзодимо провест обработку и запросить повторный ввод.
// Также допустимо введение отрицательного числа, в этом случае, программа также должна запросить повторный ввод положительного числа.
