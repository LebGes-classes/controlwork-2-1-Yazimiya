public class Main {
    public static void main(String[] args) {
        Queue<Integer> Queue = new Queue<>();

        // Добавление элементов в очередь
        Queue.enqueue(1);
        Queue.enqueue(2);
        Queue.enqueue(3);

        // Вывод размера очереди
        System.out.println("Размер очереди: " + Queue.size());

        // Извлечение и вывод элементов из очереди
        while (!Queue.isEmpty()) {
            System.out.println("Удаленный из очереди элемент: " + Queue.dequeue());
        }

        // Попытка извлечения из пустой очереди
        try {
            Queue.dequeue();
        } catch (IllegalStateException e) {
            System.out.println("Пытался выйти из пустой очереди: " + e.getMessage());
        }
    }
}
