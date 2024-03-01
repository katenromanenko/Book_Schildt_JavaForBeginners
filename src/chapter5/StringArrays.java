// Демонстрация использования массивов строк.

package chapter5;

import chapter2.Sound;

class StringArrays {
    public static void main(String[] args) {
        //создание массива строк
        String [] strs = {"Это содержимое", "является", "просто", "тестом."};

        System.out.println("Исходный массив: ");
        for (String s: strs)
            System.out.print(s + " ");
        System.out.println("\n");
        //Изменить строки.
        strs[1] = "стало";
        strs[3] = "еще одним тестом!";
        System.out.println("Модифицированный массив: ");
        for (String s: strs)
            System.out.print(s + " ");
    }
}
