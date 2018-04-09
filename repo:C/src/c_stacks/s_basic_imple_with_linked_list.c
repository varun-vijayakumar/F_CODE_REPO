/*
 * Implement stack using LL.
 */

#include <stdio.h>
#include <stdlib.h>

#define STACK_LEN 5

typedef enum {
    false = 0,
    true,
} bool;

struct stack_node {
    int data;
    struct stack_node *next;
};

bool isEmpty (struct stack_node *head) {
    if (!head) {
        return true;
    } else {
        return false;
    }
}

void push (struct stack_node **stack_head, int data) {

    struct stack_node *newNode =
        (struct stack_node *) malloc(sizeof(struct stack_node));

    *newNode = (struct stack_node){ data, NULL };

    if (!(*stack_head)) {
        *stack_head = newNode;
        return;
    }

    newNode->next = *stack_head;
    *stack_head = newNode;
    return;
}

void pop (struct stack_node **stack_head) {

    if (isEmpty(*stack_head)) {
        printf("Error : stack is empty to pop\n");
        return;
    }

    struct stack_node *temp = *stack_head;
    *stack_head = (*stack_head)->next;
    free(temp);

}

void top (struct stack_node *stack_head) {
    if (isEmpty(stack_head)) {
        printf("Error : stack is empty, no top\n");
        return;
    }

    printf("TOP : %d\n",stack_head->data);
}


void print (struct stack_node *head) {

    if (isEmpty(head)) {
        printf("Error : stack is empty\n");
        return;
    }

    while (head != NULL) {
        printf("%d ",head->data);
        head = head->next;
    }

    printf("\n");
    return;
}

int main () {
    struct stack_node *stack = NULL;

    int iter = 0;
    for (iter = 0; iter < STACK_LEN; iter++) {
        push(&stack, iter+1);
    }

    print(stack);

    for (iter = 0; iter <= STACK_LEN; iter++) {
        top(stack);
        print(stack);
        pop(&stack);
    }
}
