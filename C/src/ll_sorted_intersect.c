/*
 * Given two lists, merge their nodes together to make one list,
 * taking nodes alternately between the two lists.
 * So ShuffleMerge() with {1, 2, 3} and {7, 13, 1}
 * should yield {1, 7, 2, 13, 3, 1}.
 */

#include <stdio.h>
#include <stdlib.h>

#define LL1_LEN 20
#define LL2_LEN 20

struct node {
    int data;
    struct node *next;
};

void build(struct node **head, int data) {
	struct node *newNode = (struct node *) malloc (sizeof(struct node));
	*newNode = (struct node){data, NULL};

	if (!(*head)) {
		*head = newNode;
		return;
	}

    struct node *current = *head;
    while (current->next != NULL) {
        current = current->next;
    }

    current->next = newNode;
}

void print(struct node *head) {
    if (!head) {
        return;
    }

    while (head != NULL) {
        printf("%d ",head->data);
        head = head->next;
    }
    printf("\n");
}

struct node* sorted_intersect (struct node *left, struct node *right) {

    if (!left) {
        return NULL;
    }

    if (!right) {
        return NULL;
    }

    struct node dummy;
    struct node *tail = &dummy;

    dummy.next = NULL;

    while (left != NULL && right != NULL) {

        if (left->data == right->data) {
            build(&(tail->next), left->data);
            left = left->next;
            tail = tail->next;
            right = right->next;
        } else if (left->data < right->data) {
            left = left->next;
        } else {
            right = right->next;
        }
    }

    return dummy.next;

}

int main () {
    struct node *left = NULL;
    struct node *right = NULL;

    int iter = 0;
    for (iter = 10; iter < LL1_LEN; iter++) {
        build(&left, iter+10);
    }
    print(left);

    for (iter = 8; iter < LL2_LEN; iter++) {
        build(&right, iter+10);
    }
	print(right);

    struct node *sorted_intersect_list = NULL;

    sorted_intersect_list =sorted_intersect(left,right);

    print(sorted_intersect_list);

}
