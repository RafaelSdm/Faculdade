#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{

    int matriz[5][5];
    int i,j =0;
    int m[5];
    int numero =0;
    int maior =0;
    int guarda =0;
    int menor =0;

    srand(time(NULL));

    for(i=0;i<5;i++){
        for(j=0;j<5;j++){
                numero = (rand() %100);
                matriz[i][j] = numero;


 }
    }

    for(i=0;i<5;i++){
        for(j=0;j<5;j++){
            printf(" %d ", matriz[i][j]);
        }
        printf("\n");
    }


    for(i=0;i<5;i++){
        for(j=0;j<5;j++){
            if(maior < matriz[i][j]){
                maior = matriz[i][j];
                guarda = i;
            }
        }
    }

    menor = matriz[guarda] [i];
    for(i=0;i<5;i++){
        if(menor > matriz[guarda][i]){
            menor = matriz[guarda][i];
        }
    }


    printf("!!!!! %d rfrjfrif %d", maior, guarda);
    printf("!!!!! \n %d", menor);


    return 0;
}
