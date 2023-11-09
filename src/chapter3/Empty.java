package chapter3;
//Части цикла for могут быть пустыми.
public class Empty {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; ) {  //выражение итерации отсутствует
            System.out.println("Проход #" + i);
            i++; //инкрементирование переменной управления циклом
        }
    }
}


