import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while(true){
            String row = scanner.nextLine();
            if(row.equals("end")){
                break;
            }

            inputs.add(row);
        }

        //counting num of values divisible by three
        long numbersDivisibleByThree = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number % 3 == 0)
                .count();
        //get average
        double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.println("Divisible by three " + numbersDivisibleByThree);
        System.out.println("Average number: " + average);
    }
}
