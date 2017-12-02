

/**
 * @author Andrey Strelnikov
 * First Java Class
 */

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        //Создаем объект класса сканнер, в конструкторе задаем входной поток. Ввод с клавиатуры.
        Scanner scanner = new Scanner(System.in);
        // Выводим сообщение
        System.out.println("Выберете действие: 1 - Сумма, 2 - Умножение, 3 - Деление");
        //Добавляем новую переменную choose.
        int choose = scanner.nextInt();
        //Делаем выбор, в зависимости от введенных пользователем чисел
        switch (choose){
            case 1:
                System.out.println("Вы выбрали Сумму!");
                System.out.println("Введите число 1");
                // Водим первое число
                double i = scanner.nextDouble();
                // Водим второе число
                System.out.println("Введите число 2");
                double b = scanner.nextDouble();
                // Задаем еще одну переменную d
                double d = i + b;
                // Округляем переменную d до 4х знаков после запятой
                System.out.printf("Результат = %.4f",d);
                scanner.close();
                break;
            case 2:
                System.out.println("Вы выбрали Умножение!");
                System.out.println("Введите число 1");
                // Водим первое число
                double i1 = scanner.nextDouble();
                // Водим второе число
                System.out.println("Введите число 2");
                double b1 = scanner.nextDouble();
                // Задаем еще одну переменную d
                double d1 = i1*b1;
                // Округляем переменную d до 4х знаков после запятой
                System.out.printf("Результат = %.4f",d1);
                scanner.close();
                break;
            case 3:
                System.out.println("Вы выбрали Деление!");
                System.out.println("Введите число 1");
                // Водим первое число
                double i2 = scanner.nextDouble();
                // Водим второе число
                System.out.println("Введите число 2");
                double b2 = scanner.nextDouble();
                // Задаем еще одну переменную d
                double d2 = i2/b2;
                // Округляем переменную d до 4х знаков после запятой
                System.out.printf("Результат = %.4f",d2);
                scanner.close();
                break;
            default:
                System.out.println("Вне диапазона");
        }

    }
}