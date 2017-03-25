import java.util.Scanner;

/**
 * Created by cuibus on 25.03.2017.
 */
public class NumarMax {
    public static void main(String[] args) {


        Scanner MyConsole = new Scanner(System.in);

        int number;
        int currentMax = 0;

        do {
            System.out.print("Enter a number or 0 for exit: ");
            number = MyConsole.nextInt();

            if (number != 0 && number > currentMax) {
                currentMax = number;
            }
        }
        while (number != 0);

        if (currentMax != 0) {
            System.out.println("currentMax is: " + currentMax);
        } else {
            System.out.println("0 pressed. Exiting...");
        }
    }

}
