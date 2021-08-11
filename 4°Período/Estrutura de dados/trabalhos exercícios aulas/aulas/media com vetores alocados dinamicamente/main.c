#include <stdio.h>
#include <stdlib.h>


int* alocaMemoria(int tamanho){

    int *vetor;

    vetor = (int *) malloc(tamanho * sizeof(int));

    return vetor;



}

int main()
{

    int n;
    printf("informe o numero do tamanho do vetor:");
    scanf("%d", &n);



    int *v, i, soma;



    v = alocaMemoria(n);

    for(i=0;i<n;i++){
        printf("informe um numero:");
        scanf("%d", &v[i]);
        soma = soma + v[i];
    }



    printf("a media e de %d", soma/n);


    free(v);



    return 0;
}
