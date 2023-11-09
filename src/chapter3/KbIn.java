package chapter3;

public class KbIn {
    public static void main(String[] args)
            throws java.io.IOException{
        char ch;
        System.out.println("Нажмите клавишу  и затем Enter: ");
        ch = (char) System.in.read(); //получить символ, чтение символа с клавиатуры
        System.out.println("Была нажата клавиша: " + ch);
    }
}


