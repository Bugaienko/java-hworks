import java.util.Scanner;

// Sergii Bugaienko
public class Task2 {
    public static void main(String[] args) {
        int moving;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер направления: ");
        moving = scanner.nextInt();

        String resultMove = checkingMove(moving);

        if (!resultMove.equals("Ошибка!")) {
            System.out.printf("Вы выбрали ход: \"%s\"\n", resultMove);
        } else {
            System.out.printf("%s Некорректное значение", resultMove);
        }
        // Введите номер направления: 2
        // Вы выбрали ход: "вниз"

        // Введите номер направления: 5
        // Ошибка! Некорректное значение

    }

    static String checkingMove(int mov) {
        switch (mov) {
            case 1:
                return "вверх";
            case 2:
                return "вниз";
            case 3:
                return "влево";
            case 4:
                return "вправо";
            case 0:
                return "не двигаться";
            default:
                return "Ошибка!";

        }
    }
}

//Задача 2
//используя switch, напишите программу (отдельный метод), которая считывает номер направления
// (1 — вверх, 2 — вниз, 3 — влево, 4 — вправо, 0 — не двигаться) и
// возвращает текст « вверх » (или «вниз», или «влево» и тд) .
// Если это номер, не принадлежащий ни к одному из перечисленных направлений, программа должна выдать « ошибка! »