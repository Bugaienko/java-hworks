import java.util.Scanner;

// Sergii Bugaienko
public class Task2 {
    public static void main(String[] args) {

        int eurAmount = getAmount();

        System.out.printf("За %d EUR Вы можете получить %.2f USD\n", eurAmount, EURToUSDConverter(eurAmount));

    }

    static int getAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько евро вы хотели бы обменять: ");
        int euroAmount = scanner.nextInt();
        return euroAmount;
    }

    static double EURToUSDConverter(int eurAmount) {
        final double CROSS_COURSE = 0.973;
        return eurAmount * CROSS_COURSE;
    }

    //Сколько евро вы хотели бы обменять: 1000
    //За 1000 EUR Вы можете получить 973,00 USD


}

// Задача 2.
//реализовать метод EURToUSDConverter, который конвертирует заданную сумму  евро в сумму в долларах США.
// Результат должен возвращаться в виде boolean. Для вывода в консоль используйте форматированный вывод printf.
// Курс фиксированный 1 usd = 0.973 eur. (полученное значение необходимо округлить и вывести с точностью до двух знаков после запятой).
