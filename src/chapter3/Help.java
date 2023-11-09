package chapter3;
import java.text.BreakIterator;

/*
Упражнение 3.1.
Простая справочная система по управляющим операторам Java.

 */
public class Help {
    public static void main(String[] args)
            throws java.io.IOException{
        char choise;

        System.out.println("Справка по:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println("Выберите вариант: ");
        choise = (char) System.in.read(); //получить символ

        System.out.println("\n");

        switch (choise){
            case '1':
                System.out.println("Оператор if:\n");
                System.out.println("if (условие) оператор:");
                System.out.println("else оператор;");
            case '2':
                System.out.println("Традиционный оператор switch:\n");
                System.out.println("switch (выражение) {");
                System.out.println("    case константа:");
                System.out.println("    последовательность операторов");
                System.out.println("    break");
                System.out.println("    // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Выбранный вариант не найден.");
        }


    }
}
