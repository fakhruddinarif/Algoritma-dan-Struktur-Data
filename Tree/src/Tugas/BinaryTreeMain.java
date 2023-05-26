package Tugas;

public class BinaryTreeMain {
   public static void main(String[] args) {
      System.out.println("=== Tugas 1 ===");
      BinaryTree bt = new BinaryTree();

      bt.root = bt.addRecursive(bt.root, 6);
      bt.root = bt.addRecursive(bt.root, 4);
      bt.root = bt.addRecursive(bt.root, 8);
      bt.root = bt.addRecursive(bt.root, 3);
      bt.root = bt.addRecursive(bt.root, 5);
      bt.root = bt.addRecursive(bt.root, 7);
      bt.root = bt.addRecursive(bt.root, 9);
      bt.root = bt.addRecursive(bt.root, 10);
      bt.root = bt.addRecursive(bt.root, 15);

      System.out.println("Traverse Preorder:");
      bt.traversePreOrder(bt.root);

      System.out.println("\nTraverse Inorder:");
      bt.traverseInOrder(bt.root);

      System.out.println("\nTraverse Postorder:");
      bt.traversePostOrder(bt.root);

      System.out.println("\n\n=== Tugas 2 ===");
      bt.findMinMax();

      System.out.println("\n=== Tugas 3 ===");
      System.out.print("Leaf nodes: ");
      bt.printLeafNodes();

      System.out.println("\n\n=== Tugas 4 ===");
      int leafCount = bt.countLeafNodes();
      System.out.println("Jumlah leaf node: " + leafCount);
   }
}
