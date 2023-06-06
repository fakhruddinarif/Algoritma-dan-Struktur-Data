package TugasGeneric;

public class Node<T> {
    T data;
    Node<T> prev, next;

    Node(Node<T> prev, T data, Node<T> next) {
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
}
