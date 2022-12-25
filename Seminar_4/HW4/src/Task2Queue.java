import java.util.LinkedList;

public class Task2Queue {
    LinkedList<Integer> arr = new LinkedList<>();

    // enqueue() - помещает элемент в конец очереди
    public void enqueue(int item) {
        arr.add(item);
    }

    // dequeue() - возвращает первый элемент из очереди и удаляет его
    public int dequeue() {
        int temp = arr.get(0);
        arr.remove(0);
        return temp;
    }

    // first() - возвращает первый элемент из очереди, не удаляя.
    public int first() {
        return arr.get(0);
    }

    public LinkedList<Integer> get() {
        return arr;
    }
}
