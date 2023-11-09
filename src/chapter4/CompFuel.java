package chapter4;

class Vehicle5 {
    int passengers; // количество пассажиров
    int fuelcap;    // запас топлива в галлонах
    int mpg;       // расход топлива в милях на галлон

    //Рассчитывает объем топлива,необходимого для поездки на заданное расстояние
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}
    class CompFuel {
    public static void main(String[] args) {
        Vehicle5 minivan =new Vehicle5();
        Vehicle5 sportscar = new Vehicle5();
        double gallons;
        int dist = 252;

        //Присвоить значения полям в minivan.
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //Присвоить значения полям в minivan.
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelNeeded(dist);

        System.out.println("Минивэн может перевезти " + minivan.passengers +
                " пассажиров на расстояние " + gallons + " миль.");

        gallons = sportscar.fuelNeeded(dist);
        System.out.println("Спортивный автомобиль может перевезти " + sportscar.passengers +
                " пассажиров на расстояние " + gallons + " миль.");
    }
    }


