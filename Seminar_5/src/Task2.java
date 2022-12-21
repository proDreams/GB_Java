//Написать программу, определяющую правильность расстановки скобок в выражении.
//Пример 1: a+(d*3) - истина
//Пример 2: [a+(1*3) - ложь
//Пример 3: [6+(3*3)] - истина
//Пример 4: {a}[+]{(d*3)} - истина
//Пример 5: <{a}+{(d*3)}> - истина
//Пример 6: {a+]}{(d*3)} - ложь


import java.util.HashMap;
import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {
        String[] arr = {"a+(d*3)", "[a+(1*3)", "[6+(3*3)]", "{a}[+]{(d*3)}", "<{a}+{(d*3)}>", "{a+]}{(d*3)}"};
        for (String i : arr){
            System.out.printf("%s = %s\n", i, findBracket(i));
        }
    }

    static boolean findBracket(String str) {
        HashMap<String, String> bracketsMap = new HashMap<>();
        Stack<String> stack = new Stack<>();
        bracketsMap.put("(", ")");
        bracketsMap.put("{", "}");
        bracketsMap.put("[", "]");
        bracketsMap.put("<", ">");
        for (String item : str.split("")) {
            if (bracketsMap.containsKey(item)) {
                stack.push(item);
            } else if (bracketsMap.containsValue(item)) {
                if (!bracketsMap.get(stack.pop()).equals(item) && stack.isEmpty()){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

