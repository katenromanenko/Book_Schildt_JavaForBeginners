//// Использование substring().
package chapter5;

class SubStr {
    public static void main(String[] args) {
        String orgstr = "Язык Java заставляет веб-сеть двигаться.";
        // Создание подстроки из объекта String.
        String substr = orgstr.substring(10, 24);
        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);

    }
}
