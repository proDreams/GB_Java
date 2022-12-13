import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class task2 {
    public static void main(String[] args) {
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        String[] planets = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(planets[randomNum.nextInt(0, 8)]);
        }
        System.out.printf("Сгенерированный список:\n%s\n", arr);
        System.out.println("\nКоличество повторений: ");
        int count = 0;
        for (String item : planets) {
            count = Collections.frequency(arr, item);
            if (count > 0) {
                System.out.printf("%s %d\n", item, count);
            }
        }
        System.out.println("\nОчищенный от повторов список:");
        for (String planet : planets) {
            count = Collections.frequency(arr, planet);
            if (count > 1) {
                for (int i = 0; i < count - 1; i++) {
                    arr.remove(planet);
                }
            }
        }
        System.out.println(arr);
    }
}
