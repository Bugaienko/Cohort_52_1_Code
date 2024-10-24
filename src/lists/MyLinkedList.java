package lists;

import org.junit.platform.engine.support.hierarchical.Node;

/**
 * @author Sergey Bugaenko
 * {@code @date} 24.10.2024
 */

//public class MyLinkedList<T> implements MyList<T> {
public class MyLinkedList<T>  {

    private Node<T> first;
    private Node<T> last;
    private int size;

    // Метод добавления элемента в конец списка
    public void add(T value) {
        if (first == null) {
            // не существует ни одного узла
            first = new Node<>(value, null, null);
        } else if (first.next == null) {
            // Существует только один узел (first)
            last = new Node<>(value, first, null);
            // следующий узел за first будет равен last
            first.next = last;
        } else {
            Node<T> temp = last;
            last = new Node<>(value, temp, null);
            temp.next = last;
        }
        size++;
    }

//    @Override
    public int size() {
        return size;
    }

//    @Override
    public T get(int index) {
        if (index < 0 || index >= size) return null;

        Node<T> temp = getNodeByIndex(index);
        return temp.value;
    }

    public void set(int index, T value) {
        if (index < 0 || index >= size) return;
        Node<T> temp = getNodeByIndex(index);
        temp.value = value;
    }

    private Node<T> getNodeByIndex(int index) {

        Node<T> cursor;

        if (index <= size /2) {
            System.out.println("Левый индекс");
            cursor = first;
            for (int i = 0; i < index; i++) {
                cursor = cursor.next;
            }
        } else {
            System.out.println("Правый индекс");
            cursor = last;
            for (int i = size -1; i > index; i--) {
                cursor = cursor.previous;
            }
        }

        return cursor;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        if (first != null){
            sb.append(first.value);
            Node<T> cursor = first.next;
            while (cursor != null) {
                sb.append(", ").append(cursor.value);
                cursor = cursor.next;
            }
        }

        sb.append("]");
        return sb.toString();
    }



    private static class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;

        public Node(T value, Node<T> previous, Node<T> next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }


    }

}
