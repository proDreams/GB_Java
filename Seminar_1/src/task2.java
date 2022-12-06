import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class task2 {
    public static void main(String[] args) {
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNum.nextInt(0, 2);
        }
        System.out.println(Arrays.toString(array));
        int count = 0;
        int temp = 0;
        for (int i : array) {
            if (i == 1) {
                temp++;
                if (temp > count) {
                    count = temp;
                }
            } else {
                temp = 0;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}