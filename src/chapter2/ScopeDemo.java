package chapter2;
/*
Демонстрация области видимости блока.
 */
public class ScopeDemo {
    public static void main(String[] args) {
        int x;               //переменная известна всему коду внутри main()

        x = 10;

        if (x == 10){       //начало новой области видимости
            int y = 20;     //переменная известна только этому блоку
            //Переменная х и у здесь известны
            System.out.println("x и y:" + x + " " + y);
            x = y * 2;
        }
        //y = 100;//Ошибка! Переменная у здесь неизвестна.
        //Переменная х здесь по-прежнему известна.
        System.out.println("Значение x равно " + x);
    }
}