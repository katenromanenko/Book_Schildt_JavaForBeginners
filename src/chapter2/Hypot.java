package chapter2;
/*
Использование теоремы Пифагора для нахождения
длины гипотенузы по длинам двух катетов.
 */
public class Hypot {
    public static void main(String[] args) {
        double x,y,z;

        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);
        System.out.println("Длина гипотенузы: " + z);

    }
}