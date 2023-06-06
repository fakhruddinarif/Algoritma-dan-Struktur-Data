package TugasGeneric;

import java.util.Scanner;

public class Graph<T> {
    int vertex;
    LinkedList<T>[] list;
    boolean directed;
    String[] cityNames;

    public Graph(int vertex, boolean directed) {
        this.vertex = vertex;
        this.directed = directed;
        cityNames = new String[vertex];
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public void addCityName(int vertex, String cityName) {
        cityNames[vertex] = cityName;
    }

    public boolean graphType() {
        return directed;
    }

    public void addEdge(String source, String destination) {
        int sourceIndex = getIndexByCityName(source);
        int destinationIndex = getIndexByCityName(destination);
        list[sourceIndex].addFirst(destinationIndex);
        if (!directed) {
            list[destinationIndex].addFirst(sourceIndex);
        }
    }

    public void degree(String source) throws Exception {
        int sourceIndex = getIndexByCityName(source);
        System.out.println("degree vertex " + source + " : " + list[sourceIndex].size());

        if (directed) {
            int totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j).equals(sourceIndex)) {
                        totalIn++;
                    }
                }
            }

            totalOut = list[sourceIndex].size();
            System.out.println("Indegree dari vertex " + source + " : " + totalIn);
            System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
            System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
        } else {
            int totalDegree = list[sourceIndex].size();
            System.out.println("Degree dari vertex " + source + " : " + totalDegree);
        }
    }

    public void removeEdge(String source, String destination) throws Exception {
        int sourceIndex = getIndexByCityName(source);
        int destinationIndex = getIndexByCityName(destination);

        if (sourceIndex == -1 || destinationIndex == -1) {
            throw new Exception("Nama daerah tidak ditemukan");
        }

        int index = -1;
        for (int i = 0; i < list[sourceIndex].size(); i++) {
            if (list[sourceIndex].get(i).equals(destinationIndex)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            list[sourceIndex].remove(index);
            if (!directed) {
                for (int i = 0; i < list[destinationIndex].size(); i++) {
                    if (list[destinationIndex].get(i).equals(sourceIndex)) {
                        list[destinationIndex].remove(i);
                        break;
                    }
                }
            }
        } else {
            throw new Exception("Edge tidak ada");
        }
    }

    public void removeAllEdge() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Semua edges berhasil dihapus");
    }

    private int getIndexByCityName(String cityName) {
        for (int i = 0; i < vertex; i++) {
            if (cityNames[i].equalsIgnoreCase(cityName)) {
                return i;
            }
        }
        return -1;
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " (" + cityNames[i] + ") terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    int connectedVertex = (int) list[i].get(j);
                    String connectedCityName = cityNames[connectedVertex];
                    System.out.print(connectedCityName + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah vertex: ");
        int numVertices = sc.nextInt();

        System.out.println("Apakah grafik directed? (true/false): ");
        boolean isDirected = sc.nextBoolean();

        Graph<String> graph = new Graph<>(numVertices, isDirected);

        for (int i = 0; i < numVertices; i++) {
            System.out.print("Masukkan nama daerah untuk vertex " + i + ": ");
            String cityName = sc.next();
            graph.addCityName(i, cityName);
        }

        int choice = 0;
        while (choice != 5) {
            System.out.println("\n==== Menu ====");
            System.out.println("1. Tambahkan Edge");
            System.out.println("2. Hapus Edge");
            System.out.println("3. Degree Vertex");
            System.out.println("4. Tampilkan Graph");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan jumlah edge yang ingin ditambahkan: ");
                    int numEdges = sc.nextInt();
                    for (int i = 0; i < numEdges; i++) {
                        System.out.print("Masukkan source untuk edge ke-" + (i + 1) + ": ");
                        String source = sc.next();
                        System.out.print("Masukkan destination untuk edge ke-" + (i + 1) + ": ");
                        String destination = sc.next();
                        graph.addEdge(source, destination);
                    }
                    break;
                case 2:
                    System.out.print("Masukkan source vertex: ");
                    String sourceRemove = sc.next();
                    System.out.print("Masukkan destination vertex: ");
                    String destinationRemove = sc.next();
                    try {
                        graph.removeEdge(sourceRemove, destinationRemove);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Masukkan vertex: ");
                    String vertex = sc.next();
                    try {
                        graph.degree(vertex);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        graph.printGraph();
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}
