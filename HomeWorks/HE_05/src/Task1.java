
// Sergeii Bugaienko
public class Task1 {
    public static void main(String[] args) {
        double temperature1 = 102.3;
        double temperature2 = 99.9;

        System.out.println(checkingTemps(temperature1, temperature2));

        // true
    }

    static boolean checkingTemps (double temp1, double temp2) {
        return (temp1 > 100 && temp2 < 100);
    }
}


//First level: задача 1
//Давайте представим, что у нас есть устройство, в котором есть две колбы.
// Устройство работает правильно, если температура первой колбы выше 100 градусов,
// а температура второй колбы меньше 100 градусов. Вы должны написать метод, который проверяет это устройство.
// Ваша программа должна иметь переменные temperature 1 и temperature 2. В результате он возвращать true или false.