package TugasGeneric;

public class LinkedList<T> {
    private Node<Integer> head, tail;
    private int size;

    public LinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    public void addFirst(Integer data) {
        Node<Integer> temp = new Node<>(null, data, head);
        if (head != null) {
            head.prev = temp;
        }
        if (tail == null) {
            tail = temp;
        }
        head = temp;
        size++;
    }

    public void remove(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("List kosong");
        }

        if (index < 0 || index >= size) {
            throw new Exception("Indeks di luar batas");
        }

        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node<Integer> temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            size--;
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("List kosong");
        }

        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("List kosong");
        }

        if (size == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public T get(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("List kosong");
        }

        if (index < 0 || index >= size) {
            throw new Exception("Indeks di luar batas");
        }

        Node<Integer> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (T) temp.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}
