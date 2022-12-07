//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = input.nextInt();
        System.out.println(triangleNum(num));
        System.out.println(factorial(num));
    }

    private static int triangleNum(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            count += i;
        }
        return count;
    }

    private static int factorial(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            count *= i;
        }
        return count;
    }
}
