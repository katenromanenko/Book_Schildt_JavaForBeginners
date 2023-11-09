package chapter4;
//Добавление контструктора.
class Vehicle6 {
    int passengers; // количество пассажиров
    int fuelcap;    // запас топлива в галлонах
    int mpg;       // расход топлива в милях на галлон
    // Конструктор для класса Vehicle.
    Vehicle6(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
    // Возвращает дальность поездки,
    int range() {
        return mpg * fuelcap;
    }
    //Рассчитывает объем топлива,необходимого для поездки на заданное расстояние
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}
class VehConsDemo {
    public static void main(String[] args) {
        //Создать объекты транспортных средств.
        Vehicle6 minivan =new Vehicle6(7, 16, 21);
        Vehicle6 sportscar = new Vehicle6(2, 14, 12);
        double gallons;
        int dist = 252;
        gallons = minivan.fuelNeeded(dist);

        System.out.println("Минивэн может перевезти " + dist +
                " пассажиров на расстояние " + gallons + " миль.");

        gallons = sportscar.fuelNeeded(dist);
        System.out.println("Спортивный автомобиль может перевезти " + dist +
                " пассажиров на расстояние " + gallons + " миль.");
    }
}


