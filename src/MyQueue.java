//Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя

import java.util.LinkedList;

public class MyQueue {
    private final LinkedList<Integer> linkedList = new LinkedList<>();
    private int size;

    void enqueue(int num) {
        linkedList.addLast(num);
        size++;
    }
    Integer dequeue() {
        if (size>0){
            size--;
            return linkedList.removeFirst();
        }
        return null;
    }
    Integer first() {
        if (size>0){
            return linkedList.getFirst();
        }
        return null;
    }
}
