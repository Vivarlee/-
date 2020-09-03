import java.util.Scanner;

public class Task1 {

    public static void main(String[] arg) {
        double[] arr = new double[10];

        Scanner input = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(1 / (double) (i + 1));
            sum += 1 / (double) (i + 1);
        }
        System.out.println();
        System.out.println(sum);
    }

}
