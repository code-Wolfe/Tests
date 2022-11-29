import java.util.Arrays;

public class Tests {

    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(x));

        move(x,2);

        System.out.println(Arrays.toString(x));

    }

    public static void move(int[] x, int index){

        for(int i = index; i < x.length - 1; i++){
            x[i] = x[i+1];
        }

        x[x.length-1] = -1; //-1 to simulate a null entry

    }


}
