public class Stack {
        private Truck[] data;
        private int top;

        public Stack(int capacity) {
            this.data = new Truck[capacity];
            this.top = -1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == data.length - 1;
        }

        public void push(Truck truck) {
            if (isFull()) {
                System.out.println("Stack is full. Cannot push truck.");
                return;
            }

            data[++top] = truck;
        }

        public void printStack() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return;
            }

            for (int i = top; i >= 0; i--) {
                System.out.println("Wood " + data[i].truckNumber);
            }
        }
}
