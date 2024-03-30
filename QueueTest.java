import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    public void testEnqueueAndDequeue() {
        Queue<Integer> Queue = new Queue<>();
        Queue.enqueue(1);
        Queue.enqueue(2);
        assertEquals(1, Queue.dequeue());
        assertEquals(2, Queue.dequeue());
    }

    @Test
    public void testIsEmpty() {
        Queue<String> customQueue = new Queue<>();
        assertTrue(customQueue.isEmpty());
        customQueue.enqueue("a");
        assertFalse(customQueue.isEmpty());
    }

    @Test
    public void testSize() {
        Queue<Character> customQueue = new Queue<>();
        assertEquals(0, customQueue.size());
        customQueue.enqueue('a');
        customQueue.enqueue('b');
        assertEquals(2, customQueue.size());
    }

    @Test
    public void testDequeueEmptyQueue() {
        Queue<Double> customQueue = new Queue<>();
        assertThrows(IllegalStateException.class, customQueue::dequeue);
    }
}

