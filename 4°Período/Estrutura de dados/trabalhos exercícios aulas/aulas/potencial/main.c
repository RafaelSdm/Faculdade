#include <stdio.h>
#include <stdlib.h>


int potencia(int x, int m){

    int i =0;
    int resultado =x;

    for(i=1;i<m;i++){
        resultado = resultado * m;

    }
    return resultado;

}

int main()
{
    int k, n =0;
    int pot =0;
    printf("informe o valor k:");
    scanf("%d", &k);

    printf("%d", k);
    printf("informe o valor de n:");
    scanf("%d", &n);

    printf("%d \n", n);

    pot = potencia(k , n);

    printf("\n%d a potencia é essa", pot);


    return 0;
}
