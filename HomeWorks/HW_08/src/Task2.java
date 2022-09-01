import java.util.Scanner;

// Sergii Bugaienko
public class Task2 {
    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        String str1, str2;

        System.out.println("Введите первую строку:");
        str1 = SCANNER.nextLine();
        System.out.println("Введите вторую строку:");
        str2 = SCANNER.nextLine();

        System.out.println(firstDifferrence(str1, str2));
    }

    //Введите первую строку:
    //Hello, and lets start
    //Введите вторую строку:
    //Hello
    //5
    //
    //Введите первую строку:
    //Hello
    //Введите вторую строку:
    //Hello
    //-1

    static int firstDifferrence(String str1, String str2){
        int loopIterations;
        int result;
        if (str1.length() > str2.length()) {
            loopIterations = str2.length();
            result = str2.length();
        } else if (str1.length() < str2.length()){
            loopIterations = str1.length();
            result = str1.length();
        } else {
            loopIterations = str1.length();
            result = -1;
        }
        for (int i = 0; i < loopIterations; i++) {
            if (str1.charAt(i) != str2.charAt(i)){
                result = i;
                break;
            }
        }
        return result;
    }
}

// Задача 2.
//Реализуйте метод firstDifferrence, который принимает две строки и в результате возвращает индекс первого символа,
// который не совпадает в обеих строках.
//"Hello", “Hi” -> 1;
//"Hello", “Hello, and lets start” -> 5;
