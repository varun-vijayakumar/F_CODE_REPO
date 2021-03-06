/**
 * Divide and Conquer.
 * Choose a pivot, partition based on pivot and sort.
 */

#include <stdlib.h>
#include <stdio.h>
#include <stdint.h>
#include <limits.h>
#include <time.h>
#include "quickSort.h"

typedef enum bool_ {
    false,
    true,
}bool;

void swap (int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

int partition(int *a, int start, int end) {
    int pIndex = start;
    int pivot = a[end];
    int i = 0;
    for (i = start; i < end; i++) {
        if (a[i] <= pivot) {
            swap(&a[i], &a[pIndex]);
            pIndex++;
        }
    }
    swap(&a[pIndex], &a[end]);
    return pIndex;
}
int randomizedPartition(int *a, int start, int end) {
    srand(time(NULL));
    int pIndex = rand() % (end - start);
    pIndex = pIndex + start;
    printf("pIndex = %d\n", pIndex);
    swap(&a[end],&a[pIndex]);
    return partition(a, start, end);
}

void quickSort(int *a, int start, int end) {
    if (start < end) {
        //print(a, 6);
        int pIndex = randomizedPartition(a, start, end);// can use partition(a, start, end); directly, but randomized, T(n) = O(nlogn), else O(n^2);
        quickSort(a, start, pIndex-1);
        quickSort(a, pIndex+1, end);
    }
}
