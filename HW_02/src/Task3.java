public class Task3 {
    public static void main(String[] args) {
        float pi = 3.14f;

        float cal1 = (pi * 28 * 28) / 4 * 40;
        float cal2 = (pi * 24 * 24) / 4 * 40;

        System.out.println("В пицце с диаметром 28 см будет: " + (cal1 - cal2) + " дополнительных каллорий");
    }
}

//   Second level: Задача 3.
//   Напишите программу, которая подсчитает, сколько дополнительных калорий будет, если вы купите пиццу
//   диаметром 28 см вместо пиццы диаметром 24 см.
//   Чтобы решить эту проблему, давайте предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.
//   (при расчетах используйте значение Пи равное 3.14, ответ выведите в консоль)
