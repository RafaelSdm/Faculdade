#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *p, n =0;

    p = (int *) malloc(4);

    *p = 10;

    n = 40;

    printf(" endereco de n %d \n",&n);
    printf("end de p : %d", p);

    printf(" \n ender de n %d", n);


    return 0;
}
