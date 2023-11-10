package chapter5;
// Демонстрация использования одномерного массива.
class ArrayDemo {
    public static void main(String[] args) {
        //Создание массива типа int из 10 элементов
        // и связывает его с переменной ссылки на массив по имени simple.
        int[] sample = new int[10];
        int i;

        for (i = 0; i < 10; i = i + 1)
            sample[i] = i;
        for (i = 0; i < 10; i = i + 1)
            System.out.println("Элемент sample[" + i + "]: " + sample[i]);

    }
}
