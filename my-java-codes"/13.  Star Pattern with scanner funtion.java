import java.util.Scanner;

public class StarPattern2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number :");

        int rows = input.nextInt();

        for (int i = rows; i >= 1; --i) {

            for (int j = 1; j <= i; ++j) {

                System.out.print("* ");

            }

            System.out.println();

        }

    }

}
