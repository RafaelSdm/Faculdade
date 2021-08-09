#include <stdio.h>
#include <stdlib.h>

    int somatorio(int n){

        int somaT = 0;
        int i =0;

      for(i=0;i<=n;i++){
                somaT = i + somaT;

        }


        return somaT + n;

}

int main()
{
    int numero =0;
    int soma =0;
    printf("informe um numero:");
    scanf("%d", &numero);

    soma = somatorio(numero);


    printf("%d a soma é essa", soma);
    return 0;
}


