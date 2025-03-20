#include <stdio.h>
#define SIZE 5  

int queue[SIZE], front = -1, rear = -1;

// Function to enqueue (insert)
void enqueue(int value) {
    if (rear == SIZE - 1) {
        printf("Queue is Full\n");
        return;
    }
    if (front == -1) front = 0;
    queue[++rear] = value;
    printf("%d enqueued\n", value);
}

// Function to dequeue (remove)
void dequeue() {
    if (front == -1 || front > rear) {
        printf("Queue is Empty\n");
        return;
    }
    printf("%d dequeued\n", queue[front++]);
    if (front > rear) front = rear = -1;  // Reset queue when empty
}

// Function to display queue
void display() {
    if (front == -1 || front > rear) {
        printf("Queue is Empty\n");
        return;
    }
    printf("Queue: ");
    for (int i = front; i <= rear; i++)
        printf("%d ", queue[i]);
    printf("\n");
}

// Main function
int main() {
    enqueue(10);
    enqueue(20);
    enqueue(30);
    display();
    dequeue();
    display();
    return 0;
}
