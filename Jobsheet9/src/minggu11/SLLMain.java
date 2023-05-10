package minggu11;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        singleLinkedList.print();
        singleLinkedList.addFirst(890);
        singleLinkedList.print();
        singleLinkedList.addLast(760);
        singleLinkedList.print();
        singleLinkedList.addFirst(700);
        singleLinkedList.print();
        singleLinkedList.insertAfter(700, 999);
        singleLinkedList.print();
        singleLinkedList.insertAt(3, 833);
        singleLinkedList.print();

        System.out.println("Data Pada Index Ke-1 = " + singleLinkedList.getData(1));
        System.out.println("Data 3 Berada Pada Index Ke-" + singleLinkedList.indexOf(760));
        singleLinkedList.remove(999);
        singleLinkedList.print();
        singleLinkedList.removeAt(0);
        singleLinkedList.print();
        singleLinkedList.removeFirst();
        singleLinkedList.print();
        singleLinkedList.removeLast();
        singleLinkedList.print();

        System.out.println();
//        Create Object
        SingleLinkedList sll = new SingleLinkedList();
        sll.addFirst(20);
        sll.print();
        sll.addLast(10);
        sll.print();
        sll.insertAfter(20, 1);
        sll.print();
        sll.insertBefore(1, 30);
        sll.print();
    }
}
