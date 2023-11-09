package chapter2;
/*
Демонстрация работы короткозамкнутой операции.
 */
public class SCops {
    public static void main(String[] args) {
        int n, d, q;

        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " - множитель " + n);
        d = 0;
        //Поскольку d  равно нулю, второй операнд не вычисляется.
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " - множитель " + n);
        /*Теперь попробовать то же самое, не используя короткозамкнутую
        операцию. В итоге возникнет ошибка деления на ноль.
        */
        if (d != 0 & (n % d) == 0)
            System.out.println(d + " - множитель " + n);
    }
}
