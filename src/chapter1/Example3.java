package chapter1;

/*
Программа иллюстрирует отличия между int и double.
Назовите этот файл ExamplеЗ.java.
*/
public class Example3 {
    public static void main(String[] args) {
        int v;       // объявление целочисленной переменной
        double x;    // объявление переменной с плавающей точкой
        v = 10;      // присваивание переменной v значения 10
        x = 10.0;    // присваивание переменной х значения 10.0
        System.out.println("Первоначальное значение v: " + v);
        System.out.println("Первоначальное значение x: " + x);
        System.out.println(); // вывод пустой строки

        // Поделить обе переменные на 4.
        v = v / 4;
        x = x / 4;
        System.out.println("v после деления; " + v);
        System.out.println("х после деления: " + x);

    }
}