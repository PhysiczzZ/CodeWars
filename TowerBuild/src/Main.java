import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите высоту башни: ");
        int nFloors = sc.nextInt();
        for (String floor : towerBuilder(nFloors)) {
            System.out.println(floor);
        }
    }

    public static String[] towerBuilder(int nFloors) {
        String[] tower = new String[nFloors];
        int maxWidth = 2 * nFloors - 1;
        for (int i = 0; i < nFloors; i++) {
            int stars = 2 * i + 1;
            int spaces = (maxWidth - stars) / 2;
            String floor = " ".repeat(spaces) + "*".repeat(stars) + " ".repeat(spaces);
            tower[i] = floor;
        }
        return tower;
    }
}
