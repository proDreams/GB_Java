import java.util.*;

public class Task0 {
    public static void main(String[] args) {
        Set<Integer> hash = new HashSet<>();
        Set<Integer> linked = new LinkedHashSet<>();
        Set<Integer> tree = new TreeSet<>();

        proceed(hash);
        proceed(linked);
        proceed(tree);
    }

    static void proceed(Set<Integer> set) {
        List<Integer> integers = List.of(23, 45, 4, 3, 45, 11, 67, 78, 14, 13, 12, 77, 88, 45, 11);

        set.addAll(integers);

        System.out.println(set);
    }
}
