import java.util.Scanner;

public class Task2 {

    static int[] dumbSort(int[] arr) {
        int[] sortedArr = arr.clone();
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j != 0 && arr[j] > arr[j - 1]) {
                int t = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = t;
                j--;
            }
        }
        return sortedArr;
    }

    public static void main(String[] arg) {
        int[] arr = new int[10];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.println(arr[i]);
        }
        int[] sortedArr = dumbSort(arr);
        System.out.println("");
        for (int e : arr) {
            System.out.println(e);
        }
    }
}