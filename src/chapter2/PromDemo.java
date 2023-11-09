package chapter2;
/*
Неожиданное повышение типов!
 */
public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b; //Приведение нет нужды, потому что результат уже повышен до int

        b = 10;
        b = (byte) (b * b); //Требуется приведение!
        System.out.println("i и b: " + i + " " + b);
    }
}