//Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
//Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове,
//при этом повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
//(Например, add - egg изоморфны) буква может не меняться, а остаться такой же. (Например, note - code)
//Пример 1:
//Input: s = "foo", t = "bar"
//Output: false
//Пример 2:
//Input: s = "paper", t = "title"
//Output: true


import java.util.HashMap;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String frst = sc.nextLine();
        System.out.println(iso("foo", "bar"));
    }

    static boolean iso(String first, String second) {
        HashMap<Character, Character> map = new HashMap<>();
        if (first.length() != second.length()) {
            return false;
        }
        for (int i = 0; i < first.length(); i++) {
            if (map.containsKey(first.charAt(i))) {
                if (!map.get(first.charAt(i)).equals(second.charAt(i))) {
                    return false;
                }
            } else {
                map.put(first.charAt(i), second.charAt(i));
            }
        }
        return true;
    }
}
