package chapter5;
// Поиск в массиве с использованием цикла for в стиле "for-each".
class Search {
    public static void main(String[] args) {
        int [] nums = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;
        // Поиск в массиве с использованием цикла for в стиле "for-each".
        for (int x: nums){
            if(x == val){
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Значение найдено!");
    }
}
