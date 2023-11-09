package chapter2;
/*
Упражнение 2.1.
Расчет расстояния до места вспышки молнии,
звук которого был услышан через 7.2 секунды.
 */
public class Sound {
    public static void main(String[] args) {
        //Расстояние до места вспышки.

        //double dist;
        //dist = 7.2 * 335;
        //System.out.print("Место вспышки молнии находится на расстоянии " + dist + " метров.");


        //Расстояние до объекта по времени эхо.
        double echo_time = 12;
        int echo = 2;
        int speed = 335;

        double dist = (echo_time / echo) * speed;
        System.out.println("Расстояние до крупного объекта вроде скалы " + dist);
    }
}