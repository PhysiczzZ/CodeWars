import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rm = new Random();
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rm.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));

        int index = findEvenIndex(arr);
        System.out.println(index);
    }

    public static int findEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
