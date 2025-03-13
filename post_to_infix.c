#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

#define MAX 100

// Stack structure for storing expressions and values
typedef struct {
    int top;
    char expr[MAX][MAX];  // Stack for infix expressions
    int values[MAX];      // Stack for numeric evaluation
} Stack;

// Function to initialize the stack
void initStack(Stack *s) {
    s->top = -1;
}

// Function to check if the stack is empty
int isEmpty(Stack *s) {
    return s->top == -1;
}

// Function to push an infix expression onto the stack
void push(Stack *s, char *expr, int value) {
    if (s->top == MAX - 1) {
        printf("Stack Overflow\n");
        exit(1);
    }
    strcpy(s->expr[++(s->top)], expr);
    s->values[s->top] = value;
}

// Function to pop an element from the stack
void pop(Stack *s, char *expr, int *value) {
    if (isEmpty(s)) {
        printf("Stack Underflow\n");
        exit(1);
    }
    strcpy(expr, s->expr[s->top]);
    *value = s->values[s->top--];
}

// Function to convert postfix to infix and evaluate it
void postfixToInfixEvaluate(char *exp) {
    Stack s;
    initStack(&s);

    for (int i = 0; exp[i] != '\0'; i++) {
        // If the character is a digit, push it as a string and its integer value
        if (isdigit(exp[i])) {
            char op[2] = {exp[i], '\0'};
            int value = exp[i] - '0';  // Convert char to int
            push(&s, op, value);
        }
        // If the character is an operator, pop two elements and perform operations
        else {
            char op2[MAX], op1[MAX], newExp[MAX];
            int val1, val2, result;

            pop(&s, op2, &val2);
            pop(&s, op1, &val1);

            // Format new infix expression
            sprintf(newExp, "(%s%c%s)", op1, exp[i], op2);

            // Perform numerical operation
            switch (exp[i]) {
                case '+': result = val1 + val2; break;
                case '-': result = val1 - val2; break;
                case '*': result = val1 * val2; break;
                case '/': 
                    if (val2 == 0) {
                        printf("Division by zero error\n");
                        exit(1);
                    }
                    result = val1 / val2; 
                    break;
                default: 
                    printf("Invalid operator: %c\n", exp[i]);
                    exit(1);
            }

            // Push the new expression and its result back to the stack
            push(&s, newExp, result);
        }
    }

    // Final expression and result
    char finalExp[MAX];
    int finalResult;
    pop(&s, finalExp, &finalResult);

    printf("Infix Expression: %s\n", finalExp);
    printf("Evaluated Result: %d\n", finalResult);
}

// Main function
int main() {
    char exp[MAX];

    printf("Enter postfix expression (single-digit operands): ");
    scanf("%s", exp);

    postfixToInfixEvaluate(exp);

    return 0;
}
