import java.util.ArrayList;

public class ReduceTest {

    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(7);
        values.add(3);
        values.add(2);
        values.add(1);

        int sum = values.stream().reduce(0,(previousSum, value) -> previousSum+value);
        System.out.println(sum);

        ArrayList<String> words = new ArrayList<>();
        words.add("First");
        words.add("Second");
        words.add("Third");
        words.add("Fourth");

        String combined = words.stream()
                .reduce("", (previousString,word) -> previousString + word + " ");
        System.out.println(combined);
    }
}
