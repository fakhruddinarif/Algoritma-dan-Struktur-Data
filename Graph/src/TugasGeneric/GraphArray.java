package TugasGeneric;

import java.util.Scanner;

public class GraphArray<T> {
    int vertices;

    public T getList(int index) {
        return list[index];
    }

    private T[] list;
    int[][] twoD_array;

    public GraphArray(int vertices) {
        this.vertices = vertices;
        this.list = (T[])new Object[vertices + 1];
        this.twoD_array = new int[vertices + 1][vertices + 1];
    }

    public void addVertex(int index, T data) {
        this.list[index] = data;
    }

    public void makeEdge(T to, T from, int edge) {
        try {
            int indexTo = getIndex(to);
            int indexFrom = getIndex(from);
            twoD_array[indexTo][indexFrom] = edge;
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex tidak ada");
        }
    }

    private int getIndex(T source) {
        for (int i = 1; i < list.length; i++) {
            if (list[i] == source || list[i].equals(source)) {
                return i;
            }
        }
        return -1;
    }

    public int getEdge(int to, int from) {
        try {
            return twoD_array[to][from];
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex tidak ada");
        }
        return 0;
    }

    public static void main(String[] args) {
        int v, e, count = 1;
        String to = null, from = null;
        Scanner sc = new Scanner(System.in);
        GraphArray graph;
        try {
            System.out.println("Masukkan jumlah vertices: ");
            v = sc.nextInt();
            graph = new GraphArray(v);

            System.out.println("Masukkan data : ");
            for (int i = 1; i <= v; i++) {
                String data = sc.next();
                graph.addVertex(i, data);
            }

            System.out.println("Masukkan jumlah edge: ");
            e = sc.nextInt();

            System.out.println("Masukkan edges: <to> <from>");
            while (count <= e) {
                to = sc.next();
                from = sc.next();

                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D sebagai representasi graph sbb: ");
            System.out.print("\t\t");
            for (int i = 1; i <= v; i++) {
                System.out.print(graph.getList(i) + "\t");
            }
            System.out.println();

            for (int i = 1; i <= v; i++) {
                System.out.print(graph.getList(i) + "\t\t");
                for (int j = 1; j <= v ; j++) {
                    System.out.print(graph.getEdge(i, j) + "\t\t");
                }
                System.out.println();
            }
        } catch (Exception E) {
            System.out.println("Error. Silahkan cek kembali\n" + E.getMessage());
        }
        sc.close();
    }
}
