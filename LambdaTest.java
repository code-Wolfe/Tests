import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(7);
        list.add(4);
        list.add(2);
        list.add(6);



        ArrayList<Integer> values = list.stream()
                .filter(value -> value > 5)
                .map(value -> value * 2)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(values);
    }

}
