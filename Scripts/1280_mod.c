#include <stdio.h>
#define GET_MODULE_ID(a) a & 7
#define GET_PORT_ID(a) a >> 3
#define SET_MODULE_ID(a) a 
#define SET_PORT_ID(a, b) a | (b << 3)

int list[1276];

void get_mod (int a) {
    int mod = GET_MODULE_ID(a);
    int port = GET_PORT_ID(a);
    printf("mod : %d port : %d\n", mod, port);
}

int main()
{
    int port = 1;
    int modid = 1;
    int lgport_id = 0;
    int lgport_count = 0;
    int a = 0;
    for (lgport_id = 1; lgport_id < 1276; lgport_id++) {
        if (port == 256) {
            port = 1;
            modid++;
        }
        a = SET_MODULE_ID(modid);
        a = SET_PORT_ID(a, port);
        list[lgport_id] = a;
        port++;
    }
    a = 0;
    for (int iter = 0; iter < 1276; iter++) {
      get_mod (list[iter]);
    }
    return 0;
}
