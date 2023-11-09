package chapter3;

// Использование оператора continue,
class ContDemo {
    public static void main(String[] args) {
        int i;
        // Вывести четные числа между 0 и 100.
        for(i = 0; i<=100; i++) {
            if((i%2) != 0) continue;
            System.out.println(i);
// следующая итерация
        }
    }
}
