import java.util.ArrayList;
import java.util.List;
public class MyClass{

    public static void main(String args []){
        ArrayList<Integer> bList = new ArrayList<>();
        bList.add(18);
        bList.add(15);

        List<Integer> aList = new ArrayList<>(); //mais flexível e desacoplado

        for(int i = 0; i < 5; i++){
            aList.add((i+2) * 3);
        }

        System.out.println("toString() -- " + aList.toString());
        System.out.println("get(2) -- " + aList.get(2));
        System.out.println("indexOf(7) -- " + aList.indexOf(7));
        System.out.println("set(2, 100)  -- " + aList.set(2, 100));
        aList.add(2, 500);
        System.out.println("add(2, 500) -- " + aList.toString());
        System.out.println("size() -- " + aList.size());
        System.out.println(aList.containsAll(bList));
        System.out.println(aList.removeAll(bList));
        System.out.println(aList);
        System.out.println(aList.indexOf(100));
    }
}