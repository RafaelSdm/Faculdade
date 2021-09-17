#include <stdio.h>
#include <stdlib.h>
#include <time.h>


void SelectionSort(int a[], int n){


    int i,j,min, aux;
    for(i=0;i<n-1;i++){
        min = i;
        for(j =i+1; i<n;j++){
            if(a[j] < a[min]){
                min = j;

            }
        }

        aux =  a[min];
        a[min] = a[i];
        a[i] = aux;
    }


}


void imprime(int v[], int n){

    int i;

    for(i=0;i<n;i++){
        printf("[%d]", v[i]);
    }



}



int main()
{
    srand(time(NULL));
    int i =0;
    int tamanho = 100;
    int v[tamanho];

    for(i =0;i<tamanho;i++){
        v[i] = rand()%500;
    }

    imprime(v, tamanho);

    printf("\n----------------------------\n");

    SelectionSort(v, tamanho);

    imprime(v, tamanho);
    return 0;
}
