public class MyStack {
    int[] array;
    int size = 0;
    int index = 0;

    public MyStack() {
        array = new int[10];
    }

    public MyStack(int size) {
        array = new int[size];
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }

    public void push(int item) {
        array[index++] = item;
        size++;
        if (size > array.length - 2) {
            rebuildArray();
        }
    }

    private void rebuildArray() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public int peek() {
        return array[index - 1];
    }

    public int pop() {
        size--;
        int temp = array[index - 1];
        array[index - 1] = 0;
        index--;
        return temp;
    }

    public int[] get() {
        return array;
    }
}
