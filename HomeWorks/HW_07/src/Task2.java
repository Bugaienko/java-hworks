import java.util.Scanner;

//Sergii Bugaienko
public class Task2 {
    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int amountOfParts = SCANNER.nextInt();

        int goodParts = 0, smallParts = 0, bigParts = 0;

        for (int i = 0; i < amountOfParts; i++) {

            int status = SCANNER.nextInt();

            switch (status) {
                case 0:
                    goodParts++;
                    break;
                case 1:
                    bigParts++;
                    break;
                case -1:
                    smallParts++;
                    break;
                default:
                    break;
            }
        }

        System.out.printf("%d %d %d", goodParts, bigParts, smallParts);

        //7
        //1
        //1
        //0
        //-1
        //-1
        //2
        //-2
        //1 2 2



    }
}

//Задача 2.
//Детектор сравнивает размер деталей, производимых машиной, с эталоном.
//Если размер детали больше , то ее можно отправить на исправление, и детектор напечатает цифру 1.
//Если размер детали меньше , то она будет удалена как брак, и детектор напечатает цифру -1.
//Если деталь исправна , она отправляется в коробку с готовой к отправке продукцией, а детектор выдает 0.
//Напишите программу, которая принимает на вход количество частей n , а затем выводит последовательность значения детектора. Программа должна выводить в одной строке числа, содержащие количество деталей, готовых к отгрузке, количество деталей, подлежащих исправлению, и количество брака.
//Пример ввода :
//10
//1
//-1
//1
//1
//1
//1
//-1
//-1
//1
//-1
//
//
//Пример вывода:
//0 6 4
