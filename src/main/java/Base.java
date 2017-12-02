
/**
 * @author Andrey Strelnikov
 */

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Водим перове число
        System.out.println("Введите число 1");
        double i = scanner.nextDouble();
        // Водим второе число
        System.out.println("Введите число 2");
        double b = scanner.nextDouble();
        // Задаем еще одну переменну d
        double d = i + b;
        // Округляем переменную d до 4х знаков после заяпятой
        System.out.printf("Сумма = %.4f",d);
        scanner.close();
    }
}
