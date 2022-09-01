import java.io.IOException;
import java.util.Scanner;

// Sergii Bugaienko
public class Task1 {
    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String targetString;
        char targetChar;
        char newChar;

        System.out.print("Введите строку: ");
        targetString = SCANNER.nextLine();
        System.out.print("Введите символ, который нужно заменить: ");
        targetChar = SCANNER.nextLine().charAt(0);
        System.out.print("На какой символ нужно заменить: ");
        newChar = SCANNER.nextLine().charAt(0);

        System.out.println(changeSymbol(targetString, targetChar, newChar));

    }
    //Введите строку: I always do my homework
    //Введите символ, который нужно заменить: a
    //На какой символ нужно заменить: A
    //I AlwAys do my homework

    static String changeSymbol(String str, char charOld, char charNew) {

        // Можно было запихнуть строку в массив и прямо в массив менять символ по условию
        // char[] strToChar = str.toCharArray();

        char[] temp = new char[str.length()];
        for (int i = 0; i < str.length(); i++){
            temp[i] = (str.charAt(i) == charOld) ? charNew : str.charAt(i);
        }
        return new String(temp);
    }
}

//First level: Задание 1.
//
//
//Напишите метод chancgeSymbol, который принимает строку и два символа.
// В результате он возвращает заданную строку, где каждый первый символ был заменен вторым символом.
// Вы должны использовать только методы length() и charAt() класса String.
// Например: “I always do my homework”, ‘a’, ‘A’ -> “I AlwAys do my homework”