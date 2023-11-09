package chapter2;
/*
Демонстрация времени жизни переменной.
 */
public class VarInitDemo {
    public static void main(String[] args) {
        int x;

        for (x = 0; x <3; x++){
            int y = -1;   //у инициализируется при каждом входе в блок
            System.out.println("Значение у равно: " + y);  //всегда выводится -1
            y = 100;
            System.out.println("Теперь значение у равно: " + y);
        }
    }
}
