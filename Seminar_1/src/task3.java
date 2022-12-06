import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class task3 {
    public static void main(String[] args) {
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        int[] arr = new int[arraySize];
        createArray(arr, randomNum, arraySize);
        System.out.println(Arrays.toString(arr));
        strangeSort(arr, arraySize);
        System.out.println(Arrays.toString(arr));
    }

    private static void createArray(int[] array, ThreadLocalRandom rand, int size) {
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(2, 4);
        }
    }

    private static void strangeSort(int[] array, int size) {
        int j = size - 1;
        for (int i = 0; i < j; i++) {
            if (array[i] == 3) {
                while (array[j] == 3 && j > i) {
                    j--;
                }
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
    }
}
