#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node* next;
};
// functuion ti indsert a node a beginning
void insertAtBeginning(struct Node** head, int new_data) {
    struct Node* new_node = (struct Node*)malloc(sizeof(struct Node));
    new_node->data = new_data;
    new_node->next = *head;
    *head=new_node;
}
// function to print the linked lisst
void printList(struct Node* head){
    struct Node* temp = head;
    while (temp!= NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
}
printf("Null\n");
}
// function to free the memory of the linked list
void freeList(struct Node* head) {
    struct Node* temp;
    while (head != NULL) {
        temp = head;
        head = head->next;
        free(temp);
    }

