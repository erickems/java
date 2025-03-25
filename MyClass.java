import java.util.ArrayList;
public class MyClass{

    public static void main(String args []){
        ArrayList<Integer> aList = new ArrayList<Integer>();

        for(int i = 0; i < 5; i++){
            aList.add((i+2) * 3);
        }

        System.out.println(aList.toString() + " toString()");
        System.out.println(aList.get(2) + " get()");
        System.out.println(aList.indexOf(7) + " indexOf()");
        System.out.println(aList.size() + " size()");

        for(int i = aList.size() - 1; i >= 0; i--){
            System.out.println(i);
        }
    }
}