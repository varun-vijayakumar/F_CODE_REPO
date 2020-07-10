#include <stdio.h>
#include <stdlib.h>

int main() {
    int i, j;
    printf("interface vxlan 1\n");
    printf(" source ip 1.1.1.1\n");
    printf(" no shutdown\n"); 
    for (i = 2; i < 252; i++) {
     	    printf(" vni %d\n",i);
            printf("    vlan %d\n", i);
            printf("    vtep 2.2.1.%d\n",i);
    }
    for (i = 252, j = 2; i < 502, j < 252; i++, j++) {
            printf(" vni %d\n",i);
            printf("    vlan %d\n", i);
            printf("    vtep 2.2.2.%d\n",j);
    }
#if 0
    for (i = 2; i < 252; i++) {
            printf("vni %d\n",i);
            printf("    vlan %d\n", i);
            printf("    vtep 2.2.1.%d\n",i);
    }
    for (i = 2; i < 252; i++) {
            printf("vni %d\n",i);
            printf("    vlan %d\n", i);
            printf("    vtep 2.2.1.%d\n",i);
    }
#endif

    return 0;
}
