#include "stackLL.h"
#include <string.h>


bool isBalanced(char String[]) {
    stackLLInit();
    int i = 0;
    int len = strlen(String);
    for (i = 0; i < len ; i++) {
        if (String[i] == '[' || String[i] == '(' || String[i] == '{') {
            pushStackLL(String[i]);
        } else {
            //printf("curr : %c top : %c \n", String[i], topStackLL());
            //printStackLL();
            if ((String[i] == ']' && topStackLL() == '[')  ||
                (String[i] == '}' && topStackLL() == '{') ||
                (String[i] == ')' && topStackLL() == '(')) {
                popStackLL();
            } else if ((String[i] == ']' && topStackLL() != '[')  ||
                (String[i] == '}' && topStackLL() != '{') ||
                (String[i] == ')' && topStackLL() != ')')) {
                return false;
            } 
        }
    }

    return isStackLLEmpty();  
}
int main() {
   char String[15];
   while(1) {
       printf("Enter String : ");
       scanf("%s",String);
       printf("isBalanced : %s\n", isBalanced(String) ? "yes" : "no");
   }
}
