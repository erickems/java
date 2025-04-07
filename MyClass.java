import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyClass{

    public static void main(String args []) {
        Queue<Integer> queue  = new LinkedList<>();

        queue.add(3);
        queue.add(2);
        queue.add(1);
        queue.add(8);
        queue.add(6);

        System.out.println(queue);

        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue.element());
        System.out.println(queue);

    }
}