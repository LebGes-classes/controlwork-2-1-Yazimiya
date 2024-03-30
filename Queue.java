import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private List<T> queue;

    public Queue() {
        queue = new ArrayList<>();
    }

    public void enqueue(T element) {
        queue.add(element);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}
