import java.util.Scanner;

//Sergii Bugaienko
public class Task2 {
    public static void main(String[] args) {
        float radius;
        float pi = 3.141519f;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your radius: ");
        radius = scan.nextFloat();
        System.out.println();
        System.out.println("The area of a circle with a radius of " +radius + " is: " + (pi * radius * radius));

    }
}

//Задача 2.
//Напишите программу, которая получает радиус от пользователя, а затем отображает:
//“Площадь окружности с радиусом …..” и результат, рассчитанный по формуле
//«S =3.14rr».