package Tugas;

import java.util.Scanner;

public class Graph {
    int vertex;
    LinkedList list[];

    int isDirected;

    Graph(int vertex, int isDirected) {
        this.vertex = vertex;
        this.isDirected = isDirected;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
        }
    }

    void addEdge(int source, int destination) {
        if (graphType()) {
            //        Add Edge
            list[source].addFirst(destination);
        }
        else {
//        Add Edge
            list[source].addFirst(destination);

//        Add Back Edge (for undirected)
            list[destination].addFirst(source);
        }
    }

    void degree(int source) {
        if (graphType()) {
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j) == source) ++totalIn;
                }
                for (k = 0; k < list[source].size(); k++) {
                    list[source].get(k);
                }
                totalOut = k;
            }
            System.out.println("Indegree dari vertex " + source + ": " + totalIn);
            System.out.println("Outdegree dari vertex " + source + ": " + totalOut);
            System.out.println("Degree vertex " + source + ": " + (totalIn + totalOut));
        }
        else {
            System.out.println("Degree Vertex " + source + ": " + list[source].size());
        }
    }

    void removeEdge(int source, int destination) {
        if (graphType()) {
            for (int i = 0; i < list[source].size(); i++) {
                if (destination == list[source].get(i)) {
                    list[source].remove(i);
                }
            }
        }
        else {
            for (int i = 0; i < list[source].size(); i++) {
                if (destination == list[source].get(i)) {
                    list[source].remove(i);
                }
            }
            for (int i = 0; i < list[destination].size(); i++) {
                if (source == list[destination].get(i)) {
                    list[destination].remove(i);
                }
            }
        }
    }

    void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph Berhasil Dikosongkan");
    }

    void printGraph() {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " Terhubung Dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    boolean graphType() {
        return isDirected == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Pilihan Graph");
        System.out.println("1. Directed");
        System.out.println("2. Undirected");
        System.out.print("Pilih(1-2): ");
        int isDirected = sc.nextInt();

        System.out.print("Masukkan Jumlah Vertex: ");
        int amountVertex = sc.nextInt();
        Graph graph = new Graph(amountVertex, isDirected);
        System.out.print("Masukkan Jumlah Edge: ");
        int amountEdge = sc.nextInt();

        System.out.println("Masukkan Edge <Source> <Destination>: ");
        for (int i = 0; i < amountEdge; i++) {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            graph.addEdge(source, destination);
        }

        System.out.println("Graph Awal:");
        graph.printGraph();

        System.out.print("Masukkan Vertex Untuk Menampilkan Derajat: ");
        int source = sc.nextInt();
        graph.degree(source);

        System.out.print("Masukkan Edge Yang Ingin Dihapus <source> <destination>: ");
        int removeSource = sc.nextInt();
        int removeDestination = sc.nextInt();
        graph.removeEdge(removeSource, removeDestination);

        System.out.println("Graph Setelah Penghapusan Edge: ");
        graph.printGraph();
    }
}
