import java.util.Scanner;

public class Task3 {

    static int factorial(int n) {
        int value = 1;
        for (int i = 2; i <= n; i++) {
            value *= i;
        }
        return value;
    }

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(factorial(n));
    }

}
