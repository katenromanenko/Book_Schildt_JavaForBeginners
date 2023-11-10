package chapter5;
// Ручное выделение памяти разного объема для индексов второго измерения.
class Ragged {
    public static void main(String[] args) {
        int [][] riders = new int[7][];
        riders[0] = new int[10]; //10 элементов
        riders[1] = new int[10]; //10 элементов
        riders[2] = new int[10]; //10 элементов
        riders[3] = new int[10]; //10 элементов
        riders[4] = new int[10]; //10 элементов
        riders[5] = new int[2];  //2 элемента
        riders[6] = new int[2];  //2 элемента
        int i, j;

        //Формирование фиктивных данных.
        for (i = 0; i < 5; i++)
            for (j = 0; j < 10; j++)
                riders[i][j] = i + j + 10;
        for (i = 5; i < 7; i++)
            for (j = 0; j < 2; j++)
                riders[i][j] = i + j + 10;

        System.out.println("Количество пассажиров на рейс в рабочие дни недели:");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        System.out.println("Количество пассажиров на рейс в выходные дни:");
        for (i = 5; i < 7; i++){
            for (j = 0; j < 2; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
    }
}
