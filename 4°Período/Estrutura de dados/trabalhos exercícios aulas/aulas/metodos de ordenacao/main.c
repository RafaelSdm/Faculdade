#include <stdio.h>
#include <stdlib.h>

void shellSort(int *v, int n) {
    int i , j , valor;
    int h = 1;
    while(h < n) {
        h = 3*h+1;
    }
    while (h > 1) {
        h /= 3;
        for(i=h; i<n; i++) {
            valor = v[i];
            j = i;
            while (j >= h && valor < v[j-h]) {
                v[j] = v[j - h];
                j = j - h;
            }
            v[j] = valor;
        }
    }
}


void imprime(int v[], int n){
    int i;
    for(i=0; i<n; i++){
        printf("[%d] ", v[i]);
    }
}

int main(){

    srand(time(NULL));
    int tamanho = 500000;
    int v[tamanho],i;

    for(i=0; i<tamanho; i++){
        v[i] = rand()%500;
    }

    printf("Vetor Desordenado:\n");
    //imprime(v, tamanho);

    shellSort(v, tamanho);

    printf("\n\nVetor Ordenado: \n");

    //imprime(v, tamanho);

    return 0;
}
