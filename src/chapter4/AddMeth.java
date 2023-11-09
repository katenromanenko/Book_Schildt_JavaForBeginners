package chapter4;
// Добавление в класс Vehicle метода range().
class Vehicle3 {
    int passengers; // количество пассажиров
    int fuelcap;    // запас топлива в галлонах
    int mpg;       // расход топлива в милях на галлон

    // Отображает дальность поездки.
    void range(){
        //Метод range()содержится в классе Vehicle
        System.out.println("Дальность поездки в милях: " + fuelcap + mpg);
    }
}

class AddMeth {
    public static void main(String[] args) {
        Vehicle2 minivan =new Vehicle2();
        Vehicle2 sportscar = new Vehicle2();
        int range1, range2;

        //Присвоить значения полям в minivan.
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //Присвоить значения полям в minivan.
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        //Рассчитать дальности при полном баке.
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Минивэн может перевезти " + minivan.passengers +
                " пассажиров на расстояние " + range1 + " миль.");
        System.out.println("Спортивный автомобиль может перевезти " + sportscar.passengers +
                " пассажиров на расстояние " + range2 + " миль.");
    }
}