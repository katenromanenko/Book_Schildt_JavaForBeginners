package chapter1;
/*
Упражнение 1.4.
Эта программа отображает таблица преобразование дюймов в метры.
*/
public class TabDM {
    public static void main(String[] args) {
        double metr, duim;
        int counter;
        counter = 0; //Установить счетчик строк сначала в ноль
        for (duim = 1; duim <= 144; duim++) {
            metr = duim / 39.37; // преобразование в метры
            System.out.println(metr + " метров соответствует " +
                    duim + " дюймам.");
            counter++; //Увеличивать счетчик строк на каждой итерации.
// После каждой 12-й строки вывести пустую строку.
            if (counter == 12) { //Если значение счетчика сток равно 12, вывести пустую строку
                System.out.println();
                counter = 0; // сброс счетчика строк
            }
        }

    }
}
