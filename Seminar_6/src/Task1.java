//1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
//2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве
//и верните его в виде числа с плавающей запятой.
//Для вычисления процента используйте формулу:
//процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.


import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] args) {
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        int[] numbersArray = new int[1000];
        fillArrayList(numbersArray, randomNum);
        Set<Integer> numbersSet = new HashSet<>();
        fillSet(numbersSet, numbersArray);
        System.out.println(Arrays.toString(numbersArray));
        System.out.println(numbersSet);
        System.out.println((double) numbersSet.size() * 100 / numbersArray.length);
    }

    static void fillArrayList(int[] arr, ThreadLocalRandom rand) {
        for (int i = 0; i < 1000; i++) {
            arr[i] = rand.nextInt(0, 1000);
        }
    }

    static void fillSet(Set<Integer> set, int[] arr) {
        for (int i = 0; i < 1000; i++) {
            set.add(arr[i]);
        }
    }
}
