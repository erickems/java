import java.util.*;

public class MyClass{

    public static void main(String args []) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);
        queue.add(2);
        queue.add(8);
        queue.add(6);

        System.out.println(queue);

        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue.element());
        System.out.println(queue);

        queue.clear();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue);

        //Formas de imprimir de modo sequecial

        /*Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()) {
            int i = iterator.next();
            System.out.println(i);
        }

        for(Integer i : queue) {
            System.out.println(i);
        }*/

        queue.stream().forEach((nextElement) -> {
            System.out.println(nextElement);
        });
    }
}