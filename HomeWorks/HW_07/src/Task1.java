import java.util.Scanner;

//Sergii Bugaienko
public class Task1 {
    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int countOfStudents = SCANNER.nextInt();

        int countA = 0, countB = 0, countC = 0, countD = 0;

        //Для меня великая загадка, почему в этом цикле я должен был поставить знак <= чтоб цикл отработал нужное количество итераций...
        // если ставлю просто < выполняется на одну итерацию меньше, чем положено. Во второй задаче цикл работает нормально. Такой же цикл

        for (int i = 0; i <= countOfStudents; i++) {

            String rating = SCANNER.nextLine();

            switch (rating.toUpperCase()) {
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "C":
                    countC++;
                    break;
                case "D":
                    countD++;
                    break;
                default:
                    break;
            }
        }
        System.out.printf("%d %d %d %d", countA, countB, countC, countD);
    }
            //5
            //a
            //b
            //c
            //d
            //r
            //1 1 1 1
}


//First level: Задание 1.
//Найдите количество оценок D, C, B и A за последний тест, где n учеников из класса сдали тест.
// Программа получает число n в качестве первой строки ввода, а затем получает сами оценки, каждую в новой строке.
// Программа должна вывести четыре числа в одной строке: количество оценок A, B, C, D (в указанном порядке), разделенных пробелами.
//Пример ввода:
//14
//B
//A
//A
//A
//A
//B
//D
//D
//A
//B
//C
//B
//B
//A
//
//
//Пример вывода:
//6 5 1 2
