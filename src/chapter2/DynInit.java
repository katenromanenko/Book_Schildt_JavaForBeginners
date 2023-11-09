package chapter2;
/*
Демонстрация динамической инициализации.
 */
public class DynInit {
    public static void main(String[] args) {
        double radius = 4, height = 5;
        //Динамически инициализировать volume.
        double volume = 3.1416 * radius * height;
        System.out.println("Объем составляет " + volume);
    }
}
