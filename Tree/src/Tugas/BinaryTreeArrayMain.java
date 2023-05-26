package Tugas;

public class BinaryTreeArrayMain {
   public static void main(String[] args) {
      BinaryTreeArray bta = new BinaryTreeArray();
      int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0, 0};
      int idLast = 6;
      bta.populateData(data, idLast);

      System.out.println("Traverse Inorder: ");
      bta.traverseInOrder(0);

      bta.add(2);
      bta.add(10);

      System.out.println("\nTraverse Preorder: ");
      bta.traversePreOrder(0);

      System.out.println("\nTraverse Postorder: ");
      bta.traversePostOrder(0);
      System.out.println();
   }
}
