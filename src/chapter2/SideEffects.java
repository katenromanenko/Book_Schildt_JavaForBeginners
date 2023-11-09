package chapter2;
/*
Побочные эффекты могут быть важны.
 */
public class SideEffects {
    public static void main(String[] args) {
        int i;
        i = 0;
        /*Здесь i все равно инкрементируется, несмотря на то,
        что условие в операторе if дает false.
        */
        if (false & (++i < 100))
            System.out.println("Не отображается");
        System.out.println("Оператор if выполняется: " + i);
        //i имеет значение 1

        /*В данном случае i не икрементируется, поскольку
        короткозамкнутая операция пропускает икрементирование.*/
        if (false && (++i < 100))
            System.out.println("Не отображается");
        System.out.println("Оператор if выполняется: " + i);
        //i по-прежнему имеет значение 1!


    }
}
