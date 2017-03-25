/**
 * Created by cuibus on 25.03.2017.
 */
public class SirNumere {
    public static void main(String[] args) {
        int[] anArray = {11,13,9,8,16};
        for (int i=1;i<anArray.length;i++)
            if (anArray[i-1]>anArray[i]) {
                System.out.println(+anArray[i - 1] + " " + anArray[i]);
                i=i+1;
            }
    }
}