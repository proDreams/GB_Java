import java.util.Objects;

public class task4 {
    public static void main(String[] args) {
        String[] strings = {"String", "Strin", "Stri", "Str", "Sta"};
        String prefix = strings[0];
        for (int i = 1; i < strings.length; i++) {
            while (!strings[i].startsWith(prefix)) {
                prefix = strings[i].substring(0, prefix.length() - 1);
            }
        }
        System.out.println(prefix);
    }
}