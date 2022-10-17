import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    private static Queue<String> queue1 = new LinkedList<>();
    private static Queue<String> queue2 = new LinkedList<>();
    private static final int MAX_NUMB = 5;


    public static void main(String[] args) {
        queue1.add("произвольный хуман 1");
        queue1.add("произвольный хуман 2");
        queue1.add("произвольный хуман 3");
        queue2.add("произвольный хуман 1");
        queue2.add("произвольный хуман 2");

        for (int i = 0; i < 12; i++) {
            addPerson("Person " + i);
        }
        System.out.println("Итого:\n" +
                "длина первой очереди " + queue1.size() + "\n" +
                "длина второй очереди " + queue2.size());

    }

    private static void addPerson(String s) {
        Random r = new Random();
        if (queue2.size() > queue1.size() && queue1.size() < MAX_NUMB) {
            queue1.offer(s);
            System.out.println("в очередь 1 добавлен человечек " + s);
        } else if (queue2.size() < MAX_NUMB){
            queue2.offer(s);
            System.out.println("в очередь 2 добавлен человечек " + s);
        } else {
            System.out.println("Хааааляааааа!!! Траблы!!!");
        }
    }
}