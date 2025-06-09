import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rm = new Random();
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);
        System.out.println(numberLines(list));
        }

    public static List<String> numberLines(List<String> lines) {
        List<String> numberedLines = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            // Форматируем строку как "номер: текст"
            String numberedLine = (i + 1) + ": " + lines.get(i);
            numberedLines.add(numberedLine);
        }
        return numberedLines;
    }
}

