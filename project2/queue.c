#include <stdio.h>
#include <stdlib.h>

#define SIZE 5  // Define the size of the queue

// Queue structure
struct Queue {
    int items[SIZE];
    int front, rear;
};

// Function to initialize the queue
void initialize(struct Queue *q) {
    q->front = -1;
    q->rear = -1;
}

// Function to check if the queue is empty
int isEmpty(struct Queue *q) {
    return (q->front == -1);
}

// Function to check if the queue is full
int isFull(struct Queue *q) {
    return (q->rear == SIZE - 1);
}

// Function to enqueue (insert) an element
void enqueue(struct Queue *q, int value) {
    if (isFull(q)) {
        printf("Queue is full!\n");
        return;
    }
    if (isEmpty(q)) {
        q->front = 0;
    }
    q->rear++;
    q->items[q->rear] = value;
    printf("Inserted %d\n", value);
}

// Function to dequeue (remove) an element
int dequeue(struct Queue *q) {
    if (isEmpty(q)) {
        printf("Queue is empty!\n");
        return -1;
    }
    int removedItem = q->items[q->front];
    q->front++;
    if (q->front > q->rear) {  // Reset queue when empty
        q->front = q->rear = -1;
    }
    return removedItem;
}

// Function to display the queue
void display(struct Queue *q) {
    if (isEmpty(q)) {
        printf("Queue is empty!\n");
        return;
    }
    printf("Queue: ");
    for (int i = q->front; i <= q->rear; i++) {
        printf("%d ", q->items
