import java.util.Scanner;

//Sergii Bugaienko
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape;

        System.out.print("Выберите фигуру (треугольник, круг, прямоугольник): ");
        String shapeScanner = scanner.nextLine();
        shape = shapeScanner.trim().toLowerCase();

        double square = calculatingSquare(shape);

        if (square == 0) {
            System.out.println("Что-то пошло не так. Некорректно введены параметры фигуры");
        } else if (square == -1) {
            System.out.printf("%s? К сожалению, я не знаю такой фигуры.", shape);
        } else {
            System.out.printf("Площадь фигуры %s равняется: %.2f\n", shapeScanner, square);
        }
    }

    static double calculatingSquare(String typeOfShape) {
        switch (typeOfShape) {
            case "треугольник":
                return triangleArea();
            case "круг":
                return circleArea();
            case "прямоугольник":
                return rectangleArea();
            default:
                return -1;
        }
    }

    static double triangleArea() {
        double side1;
        double side2;
        double side3;

        System.out.print("Введите 1-ю сторону треугольника: ");
        side1 = getDouble();
        System.out.print("Введите 2-ю сторону треугольника: ");
        side2 = getDouble();
        System.out.print("Введите 3-ю сторону треугольника: ");
        side3 = getDouble();

        //Проверяем существование треугольника с заданными сторонами
        if (!checkingTriangle(side1, side2, side3)) {
            return 0;
        }
        // Считаем площадь по формуле Герона
        return geronsFormula(side1, side2, side3);
    }

    static double getDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    //Функция проверяет существование треугольника с заданными сторонами
    static boolean checkingTriangle(double a, double b, double c) {
        return (((a + b) > c) && ((a + c) > b) && ((b + c) > a));
    }

    //Функция считает площадь треугольника по формуле Герона
    static double geronsFormula(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return square;
    }

    static double rectangleArea() {
        System.out.print("Введите 1-ю сторону прямоугольника: ");
        double side1 = getDouble();
        System.out.print("Введите 2-ю сторону прямоугольника: ");
        double side2 = getDouble();

        //Проверка корректности ввода
        if (side1 <= 0 || side2 <= 0) {
            return 0;
        }
        return side1 * side2;
    }

    static double circleArea() {
        System.out.print("Введите радиус круга: ");
        double radius = getDouble();

        //Проверка корректности ввода
        if (radius <= 0) {
            return 0;
        }
        return (Math.PI * Math.pow(radius, 2));
    }
    //Выберите фигуру (треугольник, круг, прямоугольник): Еук45щт 5
    //еук45щт 5? К сожалению, я не знаю такой фигуры.

    //Выберите фигуру (треугольник, круг, прямоугольник): Треугольник
    //Введите 1-ю сторону треугольника: 3
    //Введите 2-ю сторону треугольника: 4
    //Введите 3-ю сторону треугольника: 5
    //Площадь фигуры Треугольник равняется: 6,00


}

    // Second level: задача 3
// Напишите программу, вычисляющую площади фигур (круг, треугольник, прямоугольник).
//
// считать значение от пользователя о типе фигуры, вызвать необходимый метод circleArea, triangleArea, rectangleArea,
// запросить в этих методах дополнительные параметры (радиус или длина сторон.) Метод ничего не выводит, лишь возвращает значение площади
// Формат входных данных : тип формы фигуры.
// Формат выходных данных : Площадь результирующей фигуры.
// Обратите внимание, что значение Math.PI для числа пи, округление до второго знака после запятой, площадь треугольника считаем по формуле Герона,
// все математические операции, кроме базовых реализуем при помощи класса Math

