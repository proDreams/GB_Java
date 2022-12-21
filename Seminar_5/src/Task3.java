import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(romaToArabic("MMCDXXXV"));
    }

    static Integer romaToArabic(String roma) {
        HashMap<String, Integer> numsMap = new HashMap<>();
        numsMap.put("I", 1);
        numsMap.put("V", 5);
        numsMap.put("X", 10);
        numsMap.put("L", 50);
        numsMap.put("C", 100);
        numsMap.put("D", 500);
        numsMap.put("M", 1000);
        Integer sum = numsMap.get("" + roma.charAt(roma.length() - 1));
        for (int i = roma.length() - 2; i >= 0; i--) {
            if (i != 0) {
                int right = numsMap.get("" + roma.charAt(i + 1));
                int left = numsMap.get("" + roma.charAt(i));
                if (left >= right) {
                    sum += left;
                } else {
                    sum -= left;
                }
            } else {
                sum += numsMap.get("" + roma.charAt(i));
            }
        }
        return sum;
    }
}
