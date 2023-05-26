package Praktikum1;

public class BinaryTreeMain {
   public static void main(String[] args) {
      BinaryTree bt = new BinaryTree();
//      Praktikum
      bt.add(6);
      bt.add(4);
      bt.add(8);
      bt.add(3);
      bt.add(5);
      bt.add(7);
      bt.add(9);
      bt.add(10);
      bt.add(15);

      System.out.print("Traverse Pre Order\t: ");
      bt.traversePreOrder(bt.root);
      System.out.println();
      System.out.print("Traverse In Order\t: ");
      bt.traverseInOrder(bt.root);
      System.out.println();
      System.out.print("Traverse Post Order\t: ");
      bt.traversePostOrder(bt.root);
      System.out.println();

      System.out.println("Find " + bt.find(5));
      bt.delete(8);
      bt.traversePreOrder(bt.root);
      System.out.println();

//      Tugas 1
      bt.root = bt.addRec(bt.root, 6);
      bt.root = bt.addRec(bt.root, 4);
      bt.root = bt.addRec(bt.root, 8);
      bt.root = bt.addRec(bt.root, 3);
      bt.root = bt.addRec(bt.root, 5);
      bt.root = bt.addRec(bt.root, 7);
      bt.root = bt.addRec(bt.root, 9);
      bt.root = bt.addRec(bt.root, 10);
      bt.root = bt.addRec(bt.root, 15);

      System.out.print("Traverse Pre Order\t: ");
      bt.traversePreOrder(bt.root);
      System.out.println();
      System.out.print("Traverse In Order\t: ");
      bt.traverseInOrder(bt.root);
      System.out.println();
      System.out.print("Traverse Post Order\t: ");
      bt.traversePostOrder(bt.root);
      System.out.println();

//      Tugas 2
      bt.findMinMax();

//      Tugas 3
      System.out.print("Print Leaf: ");
      bt.printLeafData();
      System.out.println();

//      Tugas 4
      int total = bt.totalLeafNodes();
      System.out.println("Jumlah Leaf: " + total);
   }
}
