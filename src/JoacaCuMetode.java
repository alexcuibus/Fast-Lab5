/**
 * Created by cuibus on 25.03.2017.
 */
public class JoacaCuMetode {
    public static void main(String[] args) {

        // sa se citeasca un string de la tastatura
        // sa se afiseze stringul in uppercase

        String s;
        s = SkeletonJava.readStringConsole("introduceti stringul:");
        System.out.println(s.toUpperCase());

        String cale="c:\temp\tt\fisier.txt";

        int delacat=cale.indexOf(".");
        String extensie = cale.substring(delacat);
        System.out.println(extensie);
    }
}
