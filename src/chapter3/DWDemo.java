package chapter3;
//Демонстрация использования цикла do-while.
public class DWDemo {
    public static void main(String[] args)
            throws java.io.IOException{
        char ch;

        do{
            System.out.println("Нажмите клавишу и затем  ENTER: ");
            ch = (char) System.in.read(); //получить символ
        }while (ch != 'q');
    }
}
