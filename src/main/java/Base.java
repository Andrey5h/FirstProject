
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
        // Получаем результат
        System.out.println("Сумма = " +(i+b));
        scanner.close();
    }
}
