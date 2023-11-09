package chapter3;
//Цикл for, выполняющийся в отрицательном направлении.
public class DecrFor {
    public static void main(String[] args) {
        int x;

        for (x = 100; x > -100; x-=5) //На каждой итерации значение переменной управления циклом уменьшается на 5
            System.out.println(x);
    }
}
