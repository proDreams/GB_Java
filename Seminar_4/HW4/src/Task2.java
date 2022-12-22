//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди
//dequeue() - возвращает первый элемент из очереди и удаляет его
//first() - возвращает первый элемент из очереди, не удаляя.
//(Подобную задачу решали на семинаре. Здесь так же нужно создать класс, который будет реализовывать указанные методы)

public class Task2 {
    public static void main(String[] args) {
        Task2Queue queue = new Task2Queue();
        queue.enqueue(123);
        queue.enqueue(234);
        queue.enqueue(345);
        System.out.println(queue.get());
        System.out.println(queue.first());
        System.out.println(queue.dequeue());
        System.out.println(queue.get());
    }
}
