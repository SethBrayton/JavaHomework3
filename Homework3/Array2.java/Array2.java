import java.util.Arrays;
import java.util.Random;

public class Array2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(90) + 10;
        }


        System.out.println("Original array: " + Arrays.toString(numbers));


        boolean increasing = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[i - 1]) {
                increasing = false;
                break;
            }
        }


        if (increasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив НЕ является строго возрастающей последовательностью.");
        }
    }
}