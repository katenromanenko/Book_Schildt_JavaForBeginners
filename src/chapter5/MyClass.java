// Использование выведения типов локальных переменных
// с классами, определенными пользователем.
package chapter5;

class MyClass {
        private int i;
        MyClass(int k) {i=k;}
        int geti() {return i;}
    void seti (int k) {if (k>=0) i = k;}
}

class VarDemo2{
    public static void main(String[] args) {
        var mc = new MyClass(10);
        System.out.println("Значение i в me равно " + mc.geti());
        mc.seti(19);
        System.out.println("Значение i в me теперь равно " + mc.geti() );
    }
}
