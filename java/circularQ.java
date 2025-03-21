class CircularQueue {
    private int[] queue;
    private int front, rear, size;

    // Constructor to initialize the circular queue
    public CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue (Insert element at the rear)
    public void enqueue(int item) {
        if ((rear + 1) % size == front) {  // Check if queue is full
            System.out.println("Queue is full!");
            return;
        }
        if (front == -1) {  // First element to be inserted
            front = 0;
        }
        rear = (rear + 1) % size;  // Circular increment
        queue[rear] = item;  // Insert item at rear
    }

    // Dequeue (Remove element from the front)
    public int dequeue() {
        if (front == -1) {  // Check if queue is empty
            System.out.println("Queue is empty!");
            return -1;
        }
        int item = queue[front];  // Get front element
        if (front == rear) {  // Last element in the queue
            front = rear = -1;  // Reset queue
        } else {
            front = (front + 1) % size;  // Circular increment
        }
        return item;
    }

    // Peek (View front element)
    public int peek() {
        if (front == -1) {  // Check if queue is empty
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    // Display Queue Elements
    public void display() {
        if (front == -1) {  // Check if queue is empty
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        while (i != rear) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println(queue[rear]);
    }

    // Main method for testing
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();       // Output: Queue: 10 20 30 40 50
        System.out.println(q.dequeue()); // Output: 10
        System.out.println(q.peek());    // Output: 20
        q.display();       // Output: Queue: 20 30 40 50
        q.enqueue(60);     // Output: Queue is full!
        q.display();       // Output: Queue: 20 30 40 50
    }
}
