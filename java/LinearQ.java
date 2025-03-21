class LinearQueue {
    private int[] queue;
    private int front, rear, size;

    // Constructor to initialize the queue
    public LinearQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue (Insert element at the rear)
    public void enqueue(int item) {
        if (rear == size - 1) {
            System.out.println("Queue is full!");
            return;
        }
        if (front == -1) front = 0;  // If queue is empty, move front to 0
        queue[++rear] = item;  // Insert element and move rear pointer
    }

    // Dequeue (Remove element from the front)
    public int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int item = queue[front++];
        if (front > rear) front = rear = -1;  // Reset queue if empty
        return item;
    }

    // Peek (View front element)
    public int peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front];
    }

    // Check if Queue is Empty
    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    // Check if Queue is Full
    public boolean isFull() {
        return rear == size - 1;
    }

    // Display Queue Elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        LinearQueue q = new LinearQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();       // Output: Queue: 10 20 30
        System.out.println(q.dequeue()); // Output: 10
        System.out.println(q.peek());    // Output: 20
        q.display();       // Output: Queue: 20 30
    }
}
