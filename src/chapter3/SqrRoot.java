package chapter3;
//Отображение квадратных корней чисел от 1 до 99 и ошибки округления.
public class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;

        for (num = 1.0; num < 100; num++){
            sroot = Math.sqrt(num);
            System.out.println("Квадратный корень числа " + num + " равен " + sroot);
            //Вычислить ошибку округления.
            rerr = num - (sroot * sroot);
            System.out.println("Ошибка округления составляет " + rerr);
            System.out.println();
        }
    }
}
