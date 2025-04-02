import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Pilha{

    public static void main(String args []){
        Stack<Integer> pilha = new Stack<Integer>();

        for(int i = 0; i <= 5; i++){
            pilha.push((i * 3) + i*2 - (1));
        }
        System.out.println(pilha);
        System.out.println(pilha.get(2));
        System.out.println(pilha.search(-1));
        System.out.println(pilha.indexOf(9));
        System.out.println(pilha.pop());
        System.out.println(pilha.peek());
        System.out.println(pilha);
    }
}