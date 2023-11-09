package chapter1;

/*
Упражнение 1.3.
Эта программа отображает расчет вашего
фактического веса на Луне.
*/
public class PowerLuna {
    public static void main(String[] args) {
        int my_ves = 60; //хранит мой вес
        int luna_ves; //мой вес на луне
        luna_ves = (my_ves * 83)/100;

        System.out.println("Мой фактический вес на Луне - " +luna_ves );


    }
}
