#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

#define MAX 100

// Stack structure
typedef struct {
    int top;
    int arr[MAX];
} Stack;

// Function to initialize stack
void initStack(Stack *s) {
    s->top = -1;
}

// Function to check if the stack is empty
int isEmpty(Stack *s) {
    return s->top == -1;
}

// Function to push an element onto the stack
void push(Stack *s, int value) {
    if (s->top == MAX - 1) {
        printf("Stack Overflow\n");
        exit(1);
    }
    s->arr[++(s->top)] = value;
}

// Function to pop an element from the stack
int pop(Stack *s) {
    if (isEmpty(s)) {
        printf("Stack Underflow\n");
        exit(1);
    }
    return s->arr[(s->top)--];
}

// Function to evaluate a postfix expression
int evaluatePostfix(char *exp) {
    Stack s;
    initStack(&s);

    for (int i = 0; exp[i] != '\0'; i++) {
        // If the character is a digit, push it to stack
        if (isdigit(exp[i])) {
            push(&s, exp[i] - '0');
        }
        // If the character is an operator, pop two elements, perform operation, and push result
        else {
            int val2 = pop(&s);
            int val1 = pop(&s);

            switch (exp[i]) {
                case '+': push(&s, val1 + val2); break;
                case '-': push(&s, val1 - val2); break;
                case '*': push(&s, val1 * val2); break;
                case '/': 
                    if (val2 == 0) {
                        printf("Division by zero error\n");
                        exit(1);
                    }
                    push(&s, val1 / val2); 
                    break;
                default: 
                    printf("Invalid operator: %c\n", exp[i]);
                    exit(1);
            }
        }
    }

    return pop(&s);
}

// Main function
int main() {
    char exp[MAX];

    printf("Enter postfix expression (single-digit operands): ");
    scanf("%s", exp);

    int result = evaluatePostfix(exp);
    printf("Result: %d\n", result);

    return 0;
}
