public class Main {
    public static void main(String[] arg) {
        Queue truckQueue = new Queue();
        Stack truckStack = new Stack(5);

        // Menambahkan truk ke antrian
        for (int i = 1; i <= 5; i++) {
            Truck truck = new Truck(i);
            truckQueue.enqueue(truck);
        }

        truckQueue.printQueue();
        System.out.println("Sisa antrian: " + truckQueue.size());
        truckStack.printStack();
        System.out.println();


        // Menumpuk kayu dan menghapus truk yang selesai
        while (!truckQueue.isEmpty()) {
            Truck currentTruck = truckQueue.dequeue();
            currentTruck.isFinished = true;
            System.out.println("Truk " + currentTruck.truckNumber + " menumpuk kayu dan selesai.");

            truckStack.push(currentTruck);

            truckQueue.printQueue();
            System.out.println("Sisa antrian: " + truckQueue.size());
            truckStack.printStack();
            System.out.println();

            // Jika truk belum selesai, tambahkan kembali ke antrian
            if (!currentTruck.isFinished()) {
                truckQueue.enqueue(currentTruck);
            }
        }
    }
}
