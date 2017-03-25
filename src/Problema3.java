
public class Problema3 {
    public static void main(String[] args) {
        int ceva=0;
        int suma=0;
        do {


            ceva =  SkeletonJava.readIntConsole( "da numarul:");
            boolean conditie= (ceva>4) && (ceva <11);
            if(conditie){
                suma= ceva + suma;
            }

        }
        while(ceva !=0);
        System.out.println(suma);

    }
}
