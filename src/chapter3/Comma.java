package chapter3;
//Использование запятых в операторе for.
public class Comma {
    public static void main(String[] args) {
        int i,j;

        for(i = 0, j = 10; i<j; i++, j--) //две переменные управления цикла
            System.out.println("i и j: " + i + " " + j);
    }
}

