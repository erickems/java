import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Lista {
    public static void main(String [] args){
        Queue<Integer> fila = new LinkedList<>();

        fila.add(2);
        fila.add(3);
        fila.add(7);
        fila.offer(1);
        fila.add(13);
        System.out.println(fila);
        System.out.println(fila.element());
        System.out.println(fila.poll());
        System.out.println(fila);
    }
}
