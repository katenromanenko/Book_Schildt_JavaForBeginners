package chapter3;
// Место размещения метки очень важно,
class Break6 {
    public static void main(String[] args) {
        int x, y ;

        // Метка находится перед оператором for.
        stop1: for(x=0; x < 5; x++) {
            for(y = 0; y < 5; y++) {
                if(y == 2) break stop1;
                System.out.println("х и у: " + x + " " + y);
            }
        }
        System.out.println();
// Метка находится непосредственно перед.
        for(x=0; x < 5; x++)
            stop2: {
                for(y = 0; y < 5; y++) {
                    if(y == 2) break stop2;
                    System.out.println("х и у: " + x + " " + y);
                }
            }
    }
}

