#include <iostream>
#include <string>
#include "person.h"
#include <vector>

using std::cout;
using std::endl;
using std::string;
using namespace std;

void test(int *x) {
    *x = 12;
}
void print (int *array, int N) {
    for (int i = 0; i < N; i++) 
        printf(" %d ", array[i]);
    printf("\n");
}
void swap (int *a, int *b) {
    int temp = *b;
    *b = *a;
    *a = temp;
}

int main() {
/*
    Person p1("Shruthi", "Sridhar", 29);
    cout << p1.getName() << endl;
    cout << p1.getName().length() << endl;
    p1.setLastName("Varun");
    string name = p1.getName();
    cout << name << endl;
    cout << name.length() << endl;
    Person p2;

    int x = 10;
    cout << x << endl;
    test(&x);
    cout << x << endl;
*/

/* arrange odd and even numbers */
/*
    int array[] = {12, 13,5,7,2,4,6,1,4};
    int N = sizeof(array) / sizeof(int);
    printf("len : %d\n", N);
    int i = 0, j = N-1;
    bool exit = false;
    while(i < j) {
        if ((array[i] % 2) && !(array[j] %2)) {
            printf("swapped %d =%d %d=%d \n", i, array[i], j, array[j]);
            swap(&array[i], &array[j]);
            if (exit)
                break;
            i++;
            j--;
        } else if ((array[i] % 2) && (array[j] %2)) {
           j--;
        } else if (!(array[i] % 2) && !(array[j] %2)) {
            i++;
        } else {
            i++;
            j--;
        }
    }
    print(array, N); */

    vector<int> num(3);
    num[0] = 1;
    num[1] = 2;
    num[2] = 3;
    
    cout << "size : " << num.size() << endl;
    
    num.push_back(8);

    cout << "size : " << num.size() << endl;

    num.pop_back();

    cout << "size : " << num.size() << endl;

  /*  cout << "begin : " << num.begin() << endl;
    cout << "cbegin : " << num.cbegin() << endl;
    cout << "rbegin : " << num.rbegin() << endl;

    cout << "end : " << num.end() << endl;
    cout << "cend : " << num.cend() << endl;
    cout << "rend : " << num.rend() << endl;

    cout << num.capacity() << endl;
    cout << num.empty() << endl;
    cout <<sizeof(num) << endl; */
    
    for (int i = 0; i < 4; i++)
        printf("%d ", num[i]);
    cout << endl;



    
}
   