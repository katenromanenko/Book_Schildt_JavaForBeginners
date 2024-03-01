//Буквы верхнего регистра.

package chapter5;

public class UpCase {
    public static void main(String[] args) {
        char ch;
        for (int i=0; i<10; i++){
            ch = (char) ('a' + i);
            System.out.print(ch);
             //Этот оператор отключает бит 6.
            ch = (char) ((int) ch & 65503);  //Теперь ch содержит букву верхнего регистра

            System.out.print(ch + " ");
        }
    }
}
