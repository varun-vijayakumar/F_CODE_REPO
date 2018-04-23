/*
 * Binary Search Tree : insert and print
 */

#include <stdio.h>
#include <stdlib.h>


struct node {
    int data;
    struct node *left;
    struct node *right;
};

void print(struct node *node) {
    if (!node) {
        return;
    }

    printf("%d\n", node->data);

    print(node->left);
    print(node->right);

}


void new_node(struct node **node, int data) {

    struct node *newNode = (struct node *) malloc (sizeof(struct node));

    *newNode = (struct node) {data, NULL, NULL};

    *node = newNode;
}

void insert(struct node **node, int data) {

    if (!(*node)) {
        new_node(node,data);
        return;
    } else if (data <= (*node)->data) {
        return insert(&((*node)->left), data);
    } else {
        return insert(&((*node)->right), data);
    }
}


int main () {

    struct node *root = NULL;


    insert(&root, 10);
    insert(&root, 5);
    insert(&root, 12);
    insert(&root, 14);
    insert(&root, 9);
    insert(&root, 3);
    insert(&root, 1);
    insert(&root, 11);
    insert(&root, 9);
    print (root);

}


