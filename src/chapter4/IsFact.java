package chapter4;

class Factor{
    //Этот метод имеет два параметра
    boolean isFactor(int a, int b){
        if ((b%a) == 0) return true;
        else return false;
    }
}

public class IsFact {
    public static void main(String[] args){
        Factor x = new Factor();

        if(x.isFactor(2,20)) System.out.println("2 - множитель.");
        if(x.isFactor(3,20)) System.out.println("Это не отобразится.");;
    }
}
