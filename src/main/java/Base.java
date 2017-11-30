public class Base {
    public static void main(String[] args)
    {
     /* Привет мир */
        System.out.println("Hello, World!");
        // Вычисление корня
        int a = 675;
        double root;
        root = Math.sqrt(a);
        System.out.printf("Корень числа %d равен %f", a, root);
        //Возводим в степень
        int b = 4;
        int s = 3;
        Math.pow(b,s);
        System.out.printf("\nЧисло 4 в кубе = " +Math.pow(b,s));

    }
}
