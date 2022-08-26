
//Sergii Bugaienko
public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        int counter = 5;

        starterVar1(counter);
        starterVar2(counter);

    }

    static void starterVar1(int counter) throws InterruptedException {
        while (counter > -1) {
            if (counter != 0) {
                System.out.println(counter);
                counter --;
                Thread.sleep(1000);
            } else {
                System.out.println("Start!\n");
                break;
            }
        }
    }

    static void starterVar2(int counter) throws InterruptedException {
        do {
            if (counter != 0) {
                System.out.println(counter);
                counter --;
                Thread.sleep(1000);
            } else {
                System.out.println("Start!\n");
                break;
            }
        } while (counter > -1);
    }
    //5
    //4
    //3
    //2
    //1
    //Start!
    //
    //5
    //4
    //3
    //2
    //1
    //Start!
}

//First level: задание 1.
//Реализуйте два метода “обратного отсчета”, который выводит числа от 5 до 1, а не выводит „старт“.
// Реализуйте его, используя оба типа циклов while/do-wile
// имеется в виду, что оба должны провести отсчет и в конце вывести "старт", просто реализация должна быть двумя способами. вывод в обоих случая должен быть одинаковый:
//5
//4
//3
//2
//1
//старт
