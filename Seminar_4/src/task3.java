import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        MyStack stack = new MyStack(15);
        System.out.println(stack.empty());
        stack.push(5);
        System.out.println(Arrays.toString(stack.get()));
        System.out.println(stack.size());
        stack.push(1234);
        System.out.println(Arrays.toString(stack.get()));
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(Arrays.toString(stack.get()));
    }
}