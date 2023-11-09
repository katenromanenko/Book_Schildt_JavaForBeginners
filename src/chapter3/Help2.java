package chapter3;
import java.text.BreakIterator;

/*
Упражнение 3.2.
Улучшенная справочная система по управляющим операторам Java,
в которой используется цикл do-while для обработки выбора
варианта меню.
 */
public class Help2 {
    public static void main(String[] args)
            throws java.io.IOException{
        char choise, ignore;
        do {
            System.out.println("Справка по:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while\n");
            System.out.println("Выберите вариант: ");

            choise = (char) System.in.read(); //получить символ

            do {
                ignore = (char)  System.in.read();
            }while (ignore != '\n');
        }while (choise<'1'|choise > '5');

        System.out.println("\n");

        switch (choise) {
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
            case '3':
                System.out.println("Цикл for:\n");
                System.out.println("for(инициализация; условие; итерация;");
                System.out.println("  оператор;");
                break;
            case '4':
                System.out.println("Цикл while:\n");
                System.out.println("while(условие) оператор;");
                break;
            case '5':
                System.out.println("Цикл do-while:\n");
                System.out.println("do  {");
                System.out.println("    оператор;");
                System.out.println("} while (условие);");
                break;
        }
    }
}