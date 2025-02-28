#include <stdio.h>
#include <stdlib.h>

#define MAXSIZE 5

int queue[MAXSIZE], front = -1, rear = -1;

void enqueue();
void dequeue();
void display();
int main() {
    int choice;
    while (1) {
        printf("\n*** Queue Operations (FIFO) ***\n");
        printf("1: Enqueue (Insert)\n");
        printf("2: Dequeue (Remove)\n");
        printf("3: Display\n");
        printf("4: Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: enqueue(); break;
            case 2: dequeue(); break;
            case 3: display(); break;
            case 4: exit(0);
            default: printf("Invalid choice! Try again.\n");
        }
    }
    return 0;
}

void enqueue() {
    if (rear == MAXSIZE - 1) {
        printf("Queue is full! (Overflow)\n");
    } else {
        int data;
        printf("Enter data: ");
        scanf("%d", &data);
        if (front == -1) front = 0;  // Set front to 0 when adding the first element
        queue[++rear] = data;
        printf("Data inserted successfully.\n");
    }
}

void dequeue() {
    if (front == -1 || front > rear) {
        printf("Queue is empty! (Underflow)\n");
    } else {
        printf("Dequeued data: %d\n", queue[front++]);
        if (front > rear) {  // Reset queue if empty
            front = rear = -1;
        }
    }
}

void display() {
    if (front == -1 || front > rear) {
        printf("Queue is empty.\n");
    } else {
        printf("Queue contents: ");
        for (int i = front; i <= rear; i++) {
            printf("%d ", queue[i]);
        }
        printf("\n");
    }
}
