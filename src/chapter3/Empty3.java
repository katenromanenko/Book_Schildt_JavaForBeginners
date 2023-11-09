package chapter3;
//Тело цикла может быть пустым.
public class Empty3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        //Просуммировать числа от 1 до 5.
        for (i = 1; i <= 5;sum += i++); //В этом цикле отсутствует тело!
        System.out.println("Сумма равна " + sum);
    }
}
