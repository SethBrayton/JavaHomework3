import java.util.Arrays;
import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        int[] numbers = new int[8];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50) + 1;
        }

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 1) {
                numbers[i] = 0;
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
