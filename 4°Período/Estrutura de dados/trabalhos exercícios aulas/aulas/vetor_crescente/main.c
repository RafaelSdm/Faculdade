#include <stdio.h>
#include <stdlib.h>

int main()
{

    int vetor[10];
    int i =0;
    int j =0;
    int aux;


    while(i<10){
        printf("informe um numero:");
        scanf("%d",&vetor[i]);

        i++;

    }

    for(i=0;i<10;i++){
            for(j=i+1;j<10;j++){
                if(vetor[i] > vetor[j] ){
                        aux = vetor[i];
                        vetor[i] = vetor[j];
                        vetor[j] = aux;


                }
            }


    }

    for(i=0;i<10;i++){
        printf("[%d]", vetor[i]);
    }


}
