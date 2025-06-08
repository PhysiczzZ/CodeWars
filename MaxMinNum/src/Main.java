import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rm = new Random();
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            list[i] = rm.nextInt(100);
        }
        System.out.println("Сгенерированный массив: " + Arrays.toString(list));

        int min = min(list);
        System.out.println("Минимальное число: " + min);
        int max = max(list);
        System.out.println("Максимальное число: " + max);

    }

    public static int min(int[] list) {
        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        return min;
    }

    public static int max(int[] list) {
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        return max;
    }
}
