package chapter2;

/*
С символьными переменными можно обращаться как с целочисленными.
 */
public class CharArithDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'X';
        System.out.println("ch содержит " + ch);
        ch++;
        System.out.println("ch содержит " + ch);
        ch = 90;
        System.out.println("ch содержит " + ch);
    }
}

