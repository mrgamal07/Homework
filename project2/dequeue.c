#include <stdio.h>
#include <stdlib.h>

// Node structure
struct Node {
    int data;
    struct Node* next;
};

struct Node* front = NULL;
struct Node* rear = NULL;

// Function to enqueue
void enqueue(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    if (!newNode) {
        printf("Memory Error\n");
        return;
    }
    newNode->data = value;
    newNode->next = NULL;
    
    if (rear == NULL) {
        front = rear = newNode;
    } else {
        rear->next = newNode;
        rear = newNode;
    }
    printf("%d enqueued\n", value);
}

// Function to dequeue
void dequeue() {
    if (front == NULL) {
        printf("Queue is Empty\n");
        return;
    }
    struct Node* temp = front;
    printf("%d dequeued\n", front->data);
    front = front->next;
    free(temp);
    
    if (front == NULL) rear = NULL;  // Reset rear when queue is empty
}

// Function to display queue
void display() {
    if (front == NULL) {
        printf("Queue is Empty\n");
        return;
    }
    struct Node* temp = front;
    printf("Queue: ");
    while (temp) {
        printf("%d ", temp->data);
        temp = temp->next;
    }
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
