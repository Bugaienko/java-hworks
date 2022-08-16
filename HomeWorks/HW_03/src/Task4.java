// Sergij Bugaienko
public class Task4 {
    public static void main(String[] args) {
        int number = 128;
        int numberByte = number<<1;
        System.out.println(numberByte); //256

        //В результате побитового сдвига двоичного числа мы, по сути, получаем эквивалент операции умножения или деления числа на 2.
        // Таким образом, сделав сдвиг влево числу 128, мы получили число в 2 раза больше
    }
}


// Second level: Задание 4.
// Создайте переменную int со значением 128. Создайте другую переменную и поместите в нее результат побитового сдвига влево первой переменной. Объясните результат.
//  пример доп материалов тут: https://metanit.com/java/tutorial/2.13.php
