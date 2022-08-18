import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

// Sergii Bugaienko
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calendar calendar = new GregorianCalendar();
        int monthToday = calendar.get(Calendar.MONTH) +1;

        int dayOfBirth;
        int monthOfBirth;
        int yearOfBirth;


        System.out.println("Привет! ...");
        System.out.print("Ох! Я не знаю твоего имени :( \nВведи, пожалуйста, свое имя: ");
        String name = getStr();
        System.out.printf("Спасибо, %s! Рада познакомиться!", name);
        System.out.print("Я очень любопытная. Хочу знать в каком году ты родился: ");
        yearOfBirth = getInt();

        //проверяем корректность введения числа
        while (yearOfBirth < 1000) {
            yearOfBirth = reenterYear();
        }

        System.out.println("Спасибо. И, может быть, последний вопросик:");
        System.out.print("В каком месяце ты родился? Просто напиши номер месяца: ");
        monthOfBirth = getInt();

        //проверяем корректность введения месяца
        while (monthOfBirth < 1 || monthOfBirth > 12) {
            monthOfBirth = reenterMonth();
        }

        // Проверяем совпадает ли месяц рождения с текущим месяцем
        // Если совпадает, запрашиваем день рождения.
        if (monthOfBirth == monthToday) {
            System.out.print("Ну я же говорила, что вопрос не последний? ;) Мне нужен день твоего рождения: ");
            dayOfBirth = getInt();
            while (dayOfBirth < 1 || dayOfBirth > 31) {
                dayOfBirth = reenterDay();
            }
            calculateAge(name, monthOfBirth, yearOfBirth, dayOfBirth);

        } else {
            calculateAge(name, monthOfBirth, yearOfBirth);
        }


    }

    static int getInt() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    static String getStr() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        return str;
    }

    static int reenterYear() {
        Scanner scan2 = new Scanner(System.in);
        System.out.print("А ты ленивый... Введи, пожалуйста, полный год твоего рождения (4 циферки): ");
        int year = scan2.nextInt();
        return year;
    }

    static int reenterMonth() {
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Хм.. Месяцев-то всего 12 есть. Введи, пожалуйста, число от 1 до 12: ");
        int month = scan2.nextInt();
        return month;
    }

    static int reenterDay() {
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Введи, пожалуйста, число от 1 до 31: ");
        int day = scan2.nextInt();
        return day;
    }

    static void calculateAge(String name, int month, int year) {
        // Если день рождения НЕ в текущем месяце

        int age;
        Calendar calendar = new GregorianCalendar();
        int monthToday = calendar.get(Calendar.MONTH) +1;
        int yearToday = calendar.get(Calendar.YEAR);

        if (month < monthToday) {
            age = yearToday - year;
        } else {
            age = yearToday - year - 1;
        }
        printResult(name, age);

    }

    static void calculateAge(String name, int month, int year, int day) {
    // Если день рождения в текущем месяце
        int age;
        boolean isBirthdayToday;


        Calendar calendar = new GregorianCalendar();
        int dayToday = calendar.get(Calendar.DAY_OF_MONTH);
        int yearToday = calendar.get(Calendar.YEAR);

        // Сегодня ли день рождения?
        if (day == dayToday) {
            age = yearToday - year;
            isBirthdayToday = true;
            printResult(name, age, isBirthdayToday);
        } else if (day < dayToday) {
            age = yearToday - year;
            printResult(name, age);
        } else {
            age = yearToday - year - 1;
            printResult(name, age);
        }


    }

    static void printResult(String name, int age) {
        String suffix;
        suffix = selectWord(age);

        System.out.printf("\nПриятно познакомиться, %s! Я прикинула - тебе %d %s\n", name, age, suffix);

    }

    static void printResult(String name, int age, boolean isBirthdayToday) {
        // Вывод для именинника
        String suffix;
        suffix = selectWord(age);

        System.out.printf("О-ла-ла! С днем Рождения, %s! Тебе сегодня исполнилось %d %s!\n", name, age, suffix);
    }

    static String selectWord(int age) {
        // Функция определяет и возвращает правильное слово после количества лет

        String ageStr = String.valueOf(age);
        char lastNumber = ageStr.charAt(ageStr.length()-1);
        if (lastNumber == '0' || lastNumber == '5' || lastNumber == '6' || lastNumber == '7' || lastNumber == '8' || lastNumber == '9') {
            return "лет";
        } else if (lastNumber == '1') {
            return "год";
        } else {
            return "года";
        }
    }
    // Привет! ...
    //Ох! Я не знаю твоего имени :(
    //Введи, пожалуйста, свое имя: Сергей
    //Спасибо, Сергей! Рада познакомиться!Я очень любопытная. Хочу знать в каком году ты родился: 77
    //А ты ленивый... Введи, пожалуйста, полный год твоего рождения (4 циферки): 197
    //А ты ленивый... Введи, пожалуйста, полный год твоего рождения (4 циферки): 1977
    //Спасибо. И, может быть, последний вопросик:
    //В каком месяце ты родился? Просто напиши номер месяца: 14
    //Хм.. Месяцев-то всего 12 есть. Введи, пожалуйста, число от 1 до 12: 8
    //Ну я же говорила, что вопрос не последний? ;) Мне нужен день твоего рождения: 17
    //
    //Приятно познакомиться, Сергей! Я прикинула - тебе 45 лет


}

//Second level: Задача 3.
//Напишите программу, которая имитирует примитивный чат-бот.
// Программа должна выводить приветствие, спрашивать имя, спрашивать год и месяц рождения (оба значения int),
// обработка возраста должна производиться в отдельном методе, при этом, если месяц рождения равен 8,
// то программа должна дополнительно запросить день рождения, чтобы корректно посчитать.
// (отталкиваемся от 18 августа, если день рождения 18 августа 1990, то считаем, что человеку уже 32 года, если 19 августа, то 31.),
// обработку дня рождения (даты) проведите внутри метода, при помощи if/else ef/ else конструкции, для вывода в консоль используйте форматированный ввод printf.
//
//
//пример:
//Привет! Назови свое имя пожалуйста:
//
//
//Ильяс Скажи пожалуйста свой год рождения 1991 Скажи пожалуйста свой месяц рождения 8
// Для корректного подсчета твоего возраста мне потребуется день твоего рождения. 18
// С днем рождения, Ильяс! Тебе сегодня исполнилось 32 года.
//
//
//либо:
//Приятно познакомиться, name! Тебе n лет/года/год
//
//
//(проведите соответствующу обработку полученного возраста, чтобы при возрасте, оканчивающемся на 0, 5, 6, 7, 8, 9 (20/36/47и тд)
// отображалось "лет", при 1 (21/31/41) отображалось "год", во всех остальных случаях "года" (32 года, 44 года и тд)
