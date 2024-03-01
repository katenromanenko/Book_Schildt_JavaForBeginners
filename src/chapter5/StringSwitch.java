// Использование строк для управления оператором switch.
package chapter5;

class StringSwitch {
    public static void main(String[] args) {
        String command = "cansel"; //объявили строковую переменную
        //тумблер выведет там где command
        switch (command){
            case "connect":
                System.out.println("Подключение");
            case "cansel":
                System.out.println("Отмена");
            case "disconnect":
                System.out.println("Отключение");
                break;
            default:
                System.out.println("Ошибочная команда!");
                break;
        }
    }
}
