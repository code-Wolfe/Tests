import java.util.ArrayList;
import java.util.HashMap;

public class test3 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("one");
        list.add("two");

        System.out.println(list);
        list.remove("one");
        System.out.println(list);
    }



}
