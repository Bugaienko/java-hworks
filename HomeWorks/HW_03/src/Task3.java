import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double radius;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your radius: ");
        radius = scan.nextDouble();
        System.out.println();
        System.out.println("The area of a circle with a radius of " +radius + " is: " + (Math.PI * radius * radius));

        //Enter your radius: 12,5
        //
        //The area of a circle with a radius of 12.5 is: 490.8738521234052
    }
}

// Задание 3.
// Напишите программу, которая получает радиус от пользователя, а затем отображает: “Площадь окружности с радиусом …..” и результат, рассчитанный по формуле
// 3.14 * r * r (радиус может быть не целочисленным)
