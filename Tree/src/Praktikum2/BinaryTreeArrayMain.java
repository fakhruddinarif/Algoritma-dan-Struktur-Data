package Praktikum2;

public class BinaryTreeArrayMain {
   public static void main(String[] args) {
      BinaryTreeArray bta = new BinaryTreeArray();
      int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0, 0};
      int idLast = 6;
      bta.populateData(data, idLast);

      System.out.print("Traverse Inorder: ");
      bta.traverseInOrder(0);

      bta.add(5);
      bta.add(30);
      bta.add(1);
      bta.add(12);

      System.out.print("\nTraverse Preorder: ");
      bta.traversePreOrder(0);

      System.out.print("\nTraverse Postorder: ");
      bta.traversePostOrder(0);
   }
}
