package chapter2;

/*
Демонстрация приведений.
 */
public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // В этом преобразование произойдет усечение. Приведение double к int
        System.out.println("Целочисленный результат x / y: " + i);

        i = 100;
        b = (byte) i; //Здесь информация не теряется. Переменная byte способна хранить значение 100.
        System.out.println("Значение b: " + b);

        i =257;
        b = (byte) i; //На этот раз информация утрачивается. Переменная byte не может хранить значение 257.
        System.out.println("Значение b: " + b);

        b =88; //код ASCII для Х
        ch = (char) b; //Приведение между несовместимыми типами
        System.out.println("Значение ch: " + ch);
    }
}