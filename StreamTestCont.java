
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamTestCont {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {

        ArrayList<Integer> div;

        div = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        return div;
    }

}