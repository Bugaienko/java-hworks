
import java.util.Scanner;

//Sergii Bugaienko
public class Task3 {
    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int months = Integer.parseInt(inputAndCheckInt());
        double depositSum = Double.parseDouble(inputAndCheckDouble());;
        System.out.printf("Через %d месяцев сумма вклада составит %.2f", months, compoundInterest(months, depositSum));

        // На сколько месяцев Вы готовы расстаться с деньгами?: 12
        //Какую сумму Вы хотите положить на депозит?: 100
        //Через 12 месяцев сумма вклада составит 112,67

        //112,67 - так я округляю начисляемые ежемесячно проценты. Т.к. на счету не должно храниться 102.345554
        // а Вы округляете просто число после произведения всех операций, с кучей знаков после запятой


    }

    static String inputAndCheckDouble() {
        System.out.print("Какую сумму Вы хотите положить на депозит?: ");
        String inputStr = SCANNER.nextLine();
        while (!checkingDoubleInput(inputStr)) {
            System.out.println("Вы ввели некорректное число!");
            System.out.print("Какую сумму Вы хотите положить на депозит?: ");
            inputStr = SCANNER.nextLine();
        }
        return inputStr;
    }

    static String inputAndCheckInt() {
        System.out.print("На сколько месяцев Вы готовы расстаться с деньгами?: ");
        String inputStr = SCANNER.nextLine();
        while (!checkingIntInput(inputStr)) {
            System.out.println("Вы ввели некорректное число!");
            System.out.print("На сколько месяцев Вы готовы расстаться с деньгами?: ");
            inputStr = SCANNER.nextLine();
        }
        return inputStr;
    }

    static boolean checkingDoubleInput(String strInput) {
        String regExpPositiveDouble = "(\\d+)(\\.?)(\\d*)";
        return strInput.matches(regExpPositiveDouble);
    }

    static boolean checkingIntInput(String strInput) {
        String regExpPositiveInt = "(\\d+)";
        return strInput.matches(regExpPositiveInt);
    }

    static double compoundInterest(int months, double depositSum) {
        double result = depositSum;
        double rate = 1;
        for (int i = 1; i <= months; i++){
            double dividends = Math.round((result * rate / 100) *100) / 100.0;
//            System.out.println(result * rate/100);
//            System.out.println(dividends);
            result += dividends;
        }
        return result;
    }
}

//Second level: Задача 3
//Необходимо реализовать программу которая подсчитает сложный процент от вклада в зависимости от срока вложения.
// Написать метод compoundInterest, который принимает в качестве аргументов 2 значения – целочисленное количество месяцев вклада и начальную сумму вклада.
// Значения суммы вклада и срока необходимо получить  от пользователя. Вклад увеличивается на 1 процент ежемесячно.
//Реализуйте «проверку на дурака» для чисел.
//
//
//Пример ввода и вывода данных:
//Пожалуйста введите срок вклада в месяцах
//   12
//Пожалуйста введите сумму вклада
//   100
//через 12 месяцев сумма вашего вклада составит 112.68
